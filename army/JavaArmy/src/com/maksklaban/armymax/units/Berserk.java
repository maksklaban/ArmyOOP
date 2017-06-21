package com.maksklaban.armymax.units;

import com.maksklaban.armymax.exceptions.*;

public class Berserk extends Unit {
    public Berserk(String nickName, int damage, int hitPoints, String title) throws CloneNotSupportedException {
        super(nickName, damage, hitPoints, title);
    }

    public Berserk(String nickName) throws CloneNotSupportedException {
        this(nickName, 25, 210, "Berserk");
    }

    public void takeMagDamage(int dmg) throws ArmyException {
        this.takeDamage(0);
    }

    public void addHitPoints(int hp) throws ArmyException {
        this.state.addHitPoints(0);
    }
}
