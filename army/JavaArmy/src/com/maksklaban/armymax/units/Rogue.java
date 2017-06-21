package com.maksklaban.armymax.units;

import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.attack.*;

public class Rogue extends Unit {
    public Rogue(String nickName, int damage, int hitPoints, String title) throws CloneNotSupportedException {
        super(nickName, damage, hitPoints, title);
        this.physicalAttack = new AttackRogue();
    }

    public Rogue(String nickName) throws CloneNotSupportedException {
        this(nickName, 40, 160, "Rogue");
    }
}
