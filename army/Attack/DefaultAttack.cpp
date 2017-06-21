#include "DefaultAttack.h"

DefaultAttack::DefaultAttack() {}

DefaultAttack::~DefaultAttack() {}

void DefaultAttack::attack(Unit* attacker, Unit* enemy) {
    enemy->takePhysicalDamage(attacker->getDamage());
    enemy->counterAttack(enemy, attacker); 
} 

void DefaultAttack::counterAttack(Unit* attacker, Unit* enemy) {
    enemy->takePhysicalDamage(attacker->getDamage() / 2);
}
