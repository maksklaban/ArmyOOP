package com.maksklaban.armymax.spell;

import com.maksklaban.armymax.units.*;
import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.spellcasters.*;

public class FireBall extends Spell {
    public FireBall(String spellName, int actionPoints, int manaCost) {
        super(spellName, actionPoints, manaCost);
    }

    public FireBall() {
        this("FireBall", 40, 30);
    }

    public void cast(Spellcaster caster, Unit enemy, Spell spell) throws ArmyException {
        caster.spendManaPoints(this.getManaCost());

        if ( caster.getTitle() == "Priest" ) {
            this.priestCast(caster, enemy, spell);
        } else if ( caster.getTitle() == "Necromanser" ) {
            this.necromanserCast(caster, enemy, spell);
        } else {
            if ( caster.getIsBattle() ) {
                enemy.takeMagDamage(this.getActionPoints());
            } else {
                enemy.takeMagDamage(this.getActionPoints() / 2);
            }
        }
    }

    protected void priestCast(Spellcaster caster, Unit enemy, Spell spell) throws ArmyException {
        if ( enemy.getIsUndead() ) {
            enemy.takeMagDamage(this.getActionPoints());
        } else {
            enemy.takeMagDamage(this.getActionPoints() / 2);
        }
    }

    protected void necromanserCast(Spellcaster caster, Unit enemy, Spell spell) throws ArmyException {
        enemy.takeMagDamage(this.getActionPoints());
        enemy.attach(caster);
    }
}
