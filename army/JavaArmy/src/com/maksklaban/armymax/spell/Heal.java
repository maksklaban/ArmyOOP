package com.maksklaban.armymax.spell;

import com.maksklaban.armymax.units.*;
import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.spellcasters.*;

public class Heal extends Spell {
    public Heal(String spellName, int actionPoints, int manaCost) {
        super(spellName, actionPoints, manaCost);
    }

    public Heal() {
        this("Heal", 45, 35);
    }

    public void cast(Spellcaster caster, Unit other, Spell spell) throws ArmyException{
        caster.spendManaPoints(this.getManaCost());

        if ( caster.getIsBattle() ) {
            other.addHitPoints(this.getActionPoints() / 2);
        } else {
            other.addHitPoints(this.getActionPoints());
        }
    }
}
