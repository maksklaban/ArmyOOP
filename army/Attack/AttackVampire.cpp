#include "AttackVampire.h"

AttackVampire::AttackVampire() {}

AttackVampire::~AttackVampire() {}

void AttackVampire::attack(Unit* attacker, Unit* enemy) {
    enemy->takePhysicalDamage(attacker->getDamage());

    attacker->addHitPoints(attacker->getDamage() / 3);

    enemy->counterAttack(enemy, attacker); 
}

void AttackVampire::counterAttack(Unit* attacker, Unit* enemy) {
    enemy->takePhysicalDamage(attacker->getDamage() / 2);

    attacker->addHitPoints(attacker->getDamage() / 6);
}