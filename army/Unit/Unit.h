#ifndef UNIT_H
#define UNIT_H

#include <iostream>
#include "../State/State.h"
#include "../State/WolfState.h"
#include "../Attack/NormalAttack.h"
#include "../Attack/DefaultAttack.h"
#include "../Attack/AttackVampire.h"
#include "../exception.h"
#include "Ability.h"
#include "Observer.h"
#include "Subject.h"

class NormalAttack;

class Unit : public Ability, public Observer, public Subject {
    protected:
        State* state;
        WolfState* wolfState;
        State* normalState;
        NormalAttack* physicalAttack;
        NormalAttack* temp;
        std::string nickName;
        bool isUndead;
        
    public:
        Unit(std::string nickName, int damage, int hitPoints, std::string title="Default", bool isUndead=false, bool isVampire=false, bool isWerewolf=false);
        virtual ~Unit();
        
        const std::string& getNickName() const;
        const int getDamage() const;
        const int getHitPoints() const;
        const int getHitPointsLimit() const;
        const bool getIsUndead() const;
        const std::string& getTitle() const;
        const State& getState() const;
        
        void takeDamage(int dmg);
        virtual void takeMagDamage(int dmg);
        void takePhysicalDamage(int dmg);
        virtual void addHitPoints(int hp);
        
        virtual void transformInToWolf();
        virtual void transformBack();
        void getVampireAttack();
        void getNormalAttack();
        virtual void turnInVampire(Unit* enemy);
        virtual void attack(Unit* attacker, Unit* enemy);
        virtual void counterAttack(Unit* attacker, Unit* enemy);
};

std::ostream& operator<<(std::ostream& out, const Unit& unit);

#endif // UNIT_H
