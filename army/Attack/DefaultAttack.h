#ifndef DEFAULTATTACK_H
#define DEFAULTATTACK_H

#include "NormalAttack.h"
#include "../Unit/Unit.h"

class Unit;

class DefaultAttack : public NormalAttack {
    public:
        DefaultAttack();
        virtual ~DefaultAttack();

        virtual void attack(Unit* attacker, Unit* enemy);
        virtual void counterAttack(Unit* attacker, Unit* enemy);
};

#endif //DEFAULTATTACK_H
