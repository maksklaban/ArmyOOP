package com.maksklaban.armymax.spellcasters;

import com.maksklaban.armymax.units.*;
import com.maksklaban.armymax.exceptions.*;

public class Wizard extends Spellcaster {
    public Wizard(String nickName, int damage, int hitPoints, int manaPoints, String title, boolean isBattle) throws CloneNotSupportedException {
        super(nickName, damage, hitPoints, manaPoints, title, true);
    }

    public Wizard(String nickName) throws CloneNotSupportedException {
        this(nickName, 15, 150, 100, "Wizard", true);
    }
}
