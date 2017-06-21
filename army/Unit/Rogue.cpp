#include "Rogue.h"

Rogue::Rogue(std::string nickName, int damage, int hitPoints, std::string title) : Unit(nickName,damage, hitPoints, title) {
    delete this->physicalAttack;
    this->physicalAttack = new AttackRogue();
}

Rogue::~Rogue() {}

