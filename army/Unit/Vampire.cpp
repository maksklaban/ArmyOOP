#include "Vampire.h"

Vampire::Vampire(std::string nickName, int damage, int hitPoints, std::string title) : Unit(nickName,damage, hitPoints, title, true, true, false) {
    delete this->physicalAttack;
    this->physicalAttack = new AttackVampire();
}

Vampire::~Vampire() {}
