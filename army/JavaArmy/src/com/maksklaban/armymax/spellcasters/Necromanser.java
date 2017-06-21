package com.maksklaban.armymax.spellcasters;

import com.maksklaban.armymax.units.*;
import com.maksklaban.armymax.exceptions.*;

public class Necromanser extends Spellcaster {
    public Necromanser(String nickName, int damage, int hitPoints, int manaPoints, String title, boolean isBattle) throws CloneNotSupportedException {
        super(nickName, damage, hitPoints, manaPoints, title, isBattle, true);
    }

    public Necromanser(String nickName) throws CloneNotSupportedException {
        this(nickName, 15, 155, 105, "Necromanser", true);
    }

    public void update(Unit other) throws ArmyException {
        this.addHitPoints(other.getHitPointsLimit() / 5);
    }

    public void attack(Unit enemy) throws ArmyException {
        super.attack(this, enemy);

        enemy.attach(this);
    }
}
