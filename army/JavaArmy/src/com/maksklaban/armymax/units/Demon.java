package com.maksklaban.armymax.units;

import com.maksklaban.armymax.spellcasters.*;
import com.maksklaban.armymax.exceptions.*;
import java.lang.ref.*;

public class Demon extends Soldier {
    protected WeakReference<Unit> owner;

    protected void ensureHisOwner(Unit other) throws ArmyException {
        WeakReference<Unit> buff = new WeakReference<Unit>(other, queue);

        if ( buff == this.owner ) {
            throw new UnitCantAttackHisOwnerException();
        }
    }

    public Demon(Unit owner) throws CloneNotSupportedException {
        super("Part of legion", 25, 200, "Demon");
        this.owner = new WeakReference<Unit>(owner, queue);
    }

    public void attack(Unit attacker, Unit enemy) throws ArmyException {
        this.ensureHisOwner(enemy);

        super.attack(this, enemy);
    }

    public void counterAttack(Unit attacker, Unit enemy) throws ArmyException {
        this.ensureHisOwner(enemy);

        super.counterAttack(attacker, enemy);
    }
}

