#include "Necromanser.h"

Necromanser::Necromanser(std::string nickName, int damage, int hitPoints, int manaPoints, std::string title) : Spellcaster(nickName, damage, hitPoints, manaPoints, title, true, true) {}

Necromanser::~Necromanser() {}

void Necromanser::attack(Unit* enemy) {
    Unit::attack(this, enemy);

    this->addSubject(enemy);
}

void Necromanser::update(Subject* enemy) {
    Observer::update(enemy);

    this->addHitPoints(this->getDamage());
}