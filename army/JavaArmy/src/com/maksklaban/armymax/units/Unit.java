package com.maksklaban.armymax.units;

import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.state.*;
import com.maksklaban.armymax.attack.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.ref.*;

public class Unit extends Ability implements Subject, Observer {
    protected Set<WeakReference<Unit>> observerList;
    protected ReferenceQueue<Unit> queue;
    protected State state;
    protected State normalState;
    protected WolfState wolfState;
    protected NormalAttack physicalAttack;
    protected NormalAttack temp;
    protected String nickName;
    protected boolean isUndead;

    public Unit(String nickName, int damage, int hitPoints, String title, boolean isUndead, boolean isVampire, boolean isWerewolf) throws CloneNotSupportedException {
        super(isVampire, isWerewolf);
        this.queue = new ReferenceQueue<Unit>();
        this.observerList = new HashSet<WeakReference<Unit>>();
        this.nickName = nickName;
        this.state = new State(hitPoints, damage, title);
        this.normalState = this.state.clone();
        this.wolfState = new WolfState(hitPoints, damage, title);
        this.physicalAttack = new DefaultAttack();
        this.isUndead = isUndead;
    }

    public Unit(String nickName, int damage, int hitPoints, String title, boolean isUndead) throws CloneNotSupportedException {
        this(nickName, damage, hitPoints, title, isUndead, false, false);
    }

    public Unit(String nickName, int damage, int hitPoints, String title) throws CloneNotSupportedException {
        this(nickName, damage, hitPoints, title, false, false, false);
    }

    public String getNickName() {
        return this.nickName;
    }

    public int getDamage() {
        return this.state.getDamage();
    }

    public int getHitPoints() {
        return this.state.getHitPoints();
    }

    public int getHitPointsLimit() {
        return this.state.getHitPointsLimit();
    }

    public boolean getIsUndead() {
        return this.isUndead;
    }

    public String getTitle() {
        return this.state.getTitle();
    }

    public State getState() {
        return this.state;
    }

    public void update(Unit other) throws ArmyException {}

    public void attach(Unit another) {
        WeakReference<Unit> buff = new WeakReference<Unit>(another, queue);

        this.observerList.add(buff);
    }


    public void notifyObserver() throws ArmyException {
        Iterator it = this.observerList.iterator();

        for ( ; it.hasNext(); ) {
            WeakReference temp = (WeakReference)it.next();
            Unit buff = (Unit)temp.get();

            buff.update(this);
        }
    }

    public void takeDamage(int dmg) throws ArmyException {
        this.state.takeDamage(dmg);

        if ( this.getHitPoints() == 0 ) {
            this.notifyObserver();
        }
    }

    public void takeMagDamage(int dmg) throws ArmyException {
        this.state.takeMagDamage(dmg);
    }

    public void takePhysicalDamage(int dmg) throws ArmyException {
        this.takeDamage(dmg);
    }

    public void addHitPoints(int hp) throws ArmyException {
        this.state.addHitPoints(hp);
    }

    public void transformInToWolf() throws ArmyException {
        int temp = this.getHitPoints() + (this.getHitPoints() / 2);

        if ( this.getIsWerewolf() && this.getHitPoints() > 0 ) {
            this.state = this.wolfState;
            this.state.setCurrentHp(temp);
        } else {
            throw new UnitCantTransformException();
        }
    }

    public void transformBack() throws ArmyException {
        int temp = this.getHitPoints() - (this.getHitPoints() / 2);

        if ( this.getTitle() == "WolfState" && this.getHitPoints() > 0 ) {
            this.state = this.normalState;
            this.state.setCurrentHp(temp);
        } else {
            throw new UnitCantTransformException();
        }
    }

    public void getVampireAttack() throws ArmyException {
        if ( this.getIsVampire() ) {
            this.temp = this.physicalAttack;
            this.physicalAttack = new AttackVampire();
        } else {
            throw new AbilityIsNotAvaibleException();
        }
    }

    public void getNormalAttack() throws ArmyException {
        if ( this.getIsVampire() ) {
            this.physicalAttack = this.temp;
        } else {
            throw new AbilityIsNotAvaibleException();
        }
    }

    public void attack(Unit attacker, Unit enemy) throws ArmyException {
        this.physicalAttack.attack(this, enemy);
    }

    public void counterAttack(Unit attacker, Unit enemy) throws ArmyException {
        this.physicalAttack.counterAttack(this, enemy);
    }

    public String toString() {
        StringBuilder out = new StringBuilder(this.getNickName());
        out.append(" " + super.toString() + this.getState());

        if ( this.getIsUndead() ) {
            out.append(", Undead");
        }

        return out.toString();
    }
}
