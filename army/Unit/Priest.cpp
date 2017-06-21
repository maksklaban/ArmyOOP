#include "Priest.h"

Priest::Priest(std::string nickName, int damage, int hitPoints, int manaPoints, std::string title) : Spellcaster(nickName, damage, hitPoints, manaPoints, title, false) {
    delete this->physicalAttack;
    this->physicalAttack = new AttackPriest();
}

Priest::~Priest() {}

