package com.maksklaban.armymax.spellcasters;

import com.maksklaban.armymax.units.*;
import com.maksklaban.armymax.exceptions.*;

public class Healer extends Spellcaster {
    public Healer(String nickName, int damage, int hitPoints, int manaPoints, String title, boolean isBattle) throws CloneNotSupportedException {
        super(nickName, damage, hitPoints, manaPoints, title, isBattle);
    }

    public Healer(String nickName) throws CloneNotSupportedException {
        this(nickName, 15, 140, 110, "Healer", false);
    }
}
