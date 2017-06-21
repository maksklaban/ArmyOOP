#include "AttackRogue.h"

AttackRogue::AttackRogue() {}

AttackRogue::~AttackRogue() {}

void AttackRogue::attack(Unit* attacker, Unit* enemy) {
    enemy->takePhysicalDamage(attacker->getDamage());
}

void AttackRogue::counterAttack(Unit* attacker, Unit* enemy) {
    enemy->takePhysicalDamage(attacker->getDamage() / 2);
}
