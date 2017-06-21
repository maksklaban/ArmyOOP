#ifndef ROGUE_H
#define ROGUE_H

#include "Unit.h"
#include "../Attack/AttackRogue.h"

class Rogue : public Unit {
    public:
        Rogue(std::string nickName, int damage=40, int hitPoints=160, std::string title="Rogue");
        virtual ~Rogue();
        
};

#endif //ROGUE_H
