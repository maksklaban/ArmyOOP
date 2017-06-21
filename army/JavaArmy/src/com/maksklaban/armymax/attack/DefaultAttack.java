package com.maksklaban.armymax.attack;

import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.state.*;
import com.maksklaban.armymax.units.*;

public class DefaultAttack extends NormalAttack {
    public DefaultAttack() {}

    public void attack(Unit attacker, Unit enemy) throws ArmyException {
        enemy.takePhysicalDamage(attacker.getDamage());
        enemy.counterAttack(enemy, attacker);
    }

    public void counterAttack(Unit attacker, Unit enemy) throws ArmyException {
        enemy.takePhysicalDamage(attacker.getDamage() / 2);
    }
}
