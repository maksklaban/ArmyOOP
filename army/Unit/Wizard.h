#ifndef WIZARD_H
#define WIZARD_H

#include "Spellcaster.h"

class Wizard : public Spellcaster {
    public:
        Wizard(std::string nickName, int damage=15, int hitPoints=150, int manaPoints=100, std::string title="Wizard");
        virtual ~Wizard();
};

#endif //WIZARD_H
