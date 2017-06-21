#ifndef ATTACK_PRIEST_H
#define ATTACK_PRIEST_H

#include "NormalAttack.h"
#include "../Unit/Unit.h"

class Unit;

class AttackPriest : public NormalAttack {
    public:
        AttackPriest();
        virtual ~AttackPriest();

        virtual void attack(Unit* attacker, Unit* enemy);
        virtual void counterAttack(Unit* attacker, Unit* enemy);
};

#endif //ATTACK_PRIEST_H
