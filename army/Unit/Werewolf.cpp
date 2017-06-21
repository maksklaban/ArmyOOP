#include "Werewolf.h"

Werewolf::Werewolf(std::string nickName, int damage, int hitPoints, std::string title) : Unit(nickName,damage, hitPoints, title, false, false, true) {}

Werewolf::~Werewolf() {}

void Werewolf::transformInToWolf() {
    int temp = this->getHitPoints() * 1.5;

    this->state = this->wolfState;
    this->state->setCurrentHp(temp);
}

void Werewolf::transformBack() {
    int temp = this->getHitPoints() / 1.5;
    
    this->state = this->normalState;
    this->state->setCurrentHp(temp);
}