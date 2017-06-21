#include "Healer.h"

Healer::Healer(std::string nickName, int damage, int hitPoints, int manaPoints, std::string title) : Spellcaster(nickName, damage, hitPoints, manaPoints, title, false) {}

Healer::~Healer() {}

