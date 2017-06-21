package com.maksklaban.armymax.spell;

import com.maksklaban.armymax.units.*;
import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.spellcasters.*;

public abstract class Spell {
    protected int manaCost;
    protected int actionPoints;
    protected String spellName;

    public Spell(String spellName, int actionPoints, int manaCost) {
        this.manaCost = manaCost;
        this.actionPoints = actionPoints;
        this.spellName = spellName;
    }

    public int getManaCost() {
        return this.manaCost;
    }

    public int getActionPoints() {
        return this.actionPoints;
    }

    public String getSpellName() {
        return this.spellName;
    }

    public abstract void cast(Spellcaster caster, Unit other, Spell spell) throws ArmyException;

    public String toString() {
        StringBuilder out = new StringBuilder(this.getSpellName());
        out.append(": Spellpower - " + this.getActionPoints() + ", Manacost - " + this.getManaCost() + ";");

        return out.toString();
    }
}