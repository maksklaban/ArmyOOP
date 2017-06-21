#include "Wizard.h"

Wizard::Wizard(std::string nickName, int damage, int hitPoints, int manaPoints, std::string title) : Spellcaster(nickName, damage, hitPoints, manaPoints, title, true) {}

Wizard::~Wizard() {};

