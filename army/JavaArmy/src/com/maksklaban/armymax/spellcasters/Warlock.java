package com.maksklaban.armymax.spellcasters;

import java.lang.ref.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import com.maksklaban.armymax.units.*;
import com.maksklaban.armymax.exceptions.*;

public class Warlock extends Wizard {
    protected Set<WeakReference<Unit>> minionsList;

    public Warlock(String nickName, int damage, int hitPoints, int manaPoints, String title, boolean isBattle) throws CloneNotSupportedException {
        super(nickName, damage, hitPoints, manaPoints, title, isBattle);
        this.minionsList = new HashSet<WeakReference<Unit>>();
    }

    public Warlock(String nickName) throws CloneNotSupportedException {
        this(nickName, 15, 150, 100, "Warlock", true);
    }

    public Demon summonDemon() throws ArmyException, CloneNotSupportedException {
        this.ensureIsAlive();

        Demon temp = new Demon(this);

        this.addSubject(temp);

        return temp;
    }

    public void takeDamage(int dmg) throws ArmyException {
        super.takeDamage(dmg);

        if ( this.getHitPoints() == 0 ) {
            this.notifyMinions();
        }
    }

    public void addSubject(Unit other) {
        WeakReference<Unit> buff = new WeakReference<Unit>(other, queue);

        this.minionsList.add(buff);
    }

    public void notifyMinions() throws ArmyException {
        Iterator it = this.minionsList.iterator();

        for ( ; it.hasNext(); ) {
            WeakReference temp = (WeakReference)it.next();
            Unit buff = (Unit)temp.get();

            buff.takeDamage(buff.getHitPointsLimit());
        }
    }
}
