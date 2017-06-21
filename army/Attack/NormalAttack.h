#ifndef NORMAL_ATTACK_H
#define NORMAL_ATTACK_H

class Unit;

class NormalAttack {
    public:
        NormalAttack();
        virtual ~NormalAttack();

        virtual void attack(Unit* attacker, Unit* enemy) = 0;
        virtual void counterAttack(Unit* attacker, Unit* enemy);
};

#endif //NORMAL_ATTACK_H
