#ifndef PRIEST_H
#define PRIEST_H

#include "Spellcaster.h"
#include "../Attack/AttackPriest.h"

class Priest : public Spellcaster {
    public:
        Priest(std::string nickName, int damage=20, int hitPoints=150, int manaPoints=115, std::string title="Priest");
        virtual ~Priest();
};

#endif // PRIEST_H

