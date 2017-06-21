package com.maksklaban.armymax.units;

import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.attack.*;

public class Vampire extends Unit {
    public Vampire(String nickName, int damage, int hitPoints, String title) throws CloneNotSupportedException {
        super(nickName, damage, hitPoints, title, true, true, false);
        this.physicalAttack = new AttackVampire();
    }

    public Vampire(String nickName) throws CloneNotSupportedException {
        this(nickName, 30, 180, "Vampire");
    }
}

