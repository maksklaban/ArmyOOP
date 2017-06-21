#ifndef ATTACK_ROGUE_H
#define ATTACK_ROGUE_H

#include "NormalAttack.h"
#include "../Unit/Unit.h"

class AttackRogue : public NormalAttack {
    public:
        AttackRogue();
        virtual ~AttackRogue();

        virtual void attack(Unit* attacker, Unit* enemy);
        virtual void counterAttack(Unit* attacker, Unit* enemy);
};


#endif //ATTACK_ROGUE_H
