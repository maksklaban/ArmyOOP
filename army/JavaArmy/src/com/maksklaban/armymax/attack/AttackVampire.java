package com.maksklaban.armymax.attack;

import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.state.*;
import com.maksklaban.armymax.units.*;

public class AttackVampire extends NormalAttack {
    public AttackVampire() {}

    public void attack(Unit attacker, Unit enemy) throws ArmyException {
        enemy.takePhysicalDamage(attacker.getDamage());

        attacker.addHitPoints(attacker.getDamage() / 3);

        enemy.counterAttack(enemy, attacker);
    }

    public void counterAttack(Unit attacker, Unit enemy) throws ArmyException {
        enemy.takePhysicalDamage(attacker.getDamage() / 2);
        attacker.addHitPoints(attacker.getDamage() / 6);
    }
}
