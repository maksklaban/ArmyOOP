#ifndef ATTACK_VAMPIRE_H
#define ATTACK_VAMPIRE_H

#include "NormalAttack.h"
#include "../Unit/Unit.h"

class Unit;

class AttackVampire : public NormalAttack {
    public:
        AttackVampire();
        virtual ~AttackVampire();

        virtual void attack(Unit* attacker, Unit* enemy);
        virtual void counterAttack(Unit* attacker, Unit* enemy);
};

#endif //ATTACK_VAMPIRE_H

