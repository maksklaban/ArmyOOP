#include "WolfState.h"

WolfState::WolfState(int hitPoints, int damage, std::string title) : State(hitPoints * 1.5, damage * 2, title) {}

WolfState::~WolfState() {}

void WolfState::takeMagDamage(int dmg) {
    State::takeMagDamage(dmg*2);
}

