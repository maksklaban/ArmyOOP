#include "AttackPriest.h"

AttackPriest::AttackPriest() {}

AttackPriest::~AttackPriest() {}

void AttackPriest::attack(Unit* attacker, Unit* enemy) {
    if ( !(enemy->getIsUndead()) ) {
        enemy->takePhysicalDamage(attacker->getDamage());
    } else {
        enemy->takePhysicalDamage(attacker->getDamage() * 2);
    }

    enemy->counterAttack(enemy, attacker);
}

void AttackPriest::counterAttack(Unit* attacker, Unit* enemy) {
    if ( !(enemy->getIsUndead()) ) {
        enemy->takePhysicalDamage(attacker->getDamage() / 2);
    } else {
        enemy->takePhysicalDamage(attacker->getDamage());
    }
}