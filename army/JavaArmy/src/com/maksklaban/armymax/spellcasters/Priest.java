package com.maksklaban.armymax.spellcasters;

import com.maksklaban.armymax.units.*;
import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.attack.*;

public class Priest extends Spellcaster {
    public Priest(String nickName, int damage, int hitPoints, int manaPoints, String title, boolean isBattle) throws CloneNotSupportedException {
        super(nickName, damage, hitPoints, manaPoints, title, isBattle);
        this.physicalAttack = new AttackPriest();
    }

    public Priest(String nickName) throws CloneNotSupportedException {
        this(nickName, 20, 140, 110, "Priest", false);
    }

}
