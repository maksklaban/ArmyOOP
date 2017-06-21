package com.maksklaban.armymax.attack;

import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.state.*;
import com.maksklaban.armymax.units.*;

public class AttackPriest extends NormalAttack {
    public AttackPriest() {}

    public void attack(Unit attacker, Unit enemy) throws ArmyException {
        if ( !(enemy.getIsUndead()) ) {
            enemy.takePhysicalDamage(attacker.getDamage());
        } else {
            enemy.takePhysicalDamage(attacker.getDamage() * 2);
        }

        enemy.counterAttack(enemy, attacker);
    }

    public void counterAttack(Unit attacker, Unit enemy) throws ArmyException {
        if ( !(enemy.getIsUndead()) ) {
            enemy.takePhysicalDamage(attacker.getDamage() / 2);
        } else {
            enemy.takePhysicalDamage(attacker.getDamage());
        }
    }
}
