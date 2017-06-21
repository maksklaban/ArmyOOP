#ifndef SPELLCASTER_H
#define SPELLCASTER_H

#include <map>
#include "../Spell/Spell.h"
#include "../Spell/FireBall.h"
#include "../Spell/Heal.h"
#include "Unit.h"

class Spellcaster : public Unit {
    protected:
        std::map<SPELL_ENUM, Spell*>* spellBook;
        int manaPoints;
        int manaPointsLimit;
        bool isBattle;
        
        void ensureIsAlive();
    public:
        Spellcaster(std::string nickName, int damage, int hitPoints, int manaPoints, std::string title, bool isBattle, bool isUndead=false);
        virtual ~Spellcaster();
        
        const std::map<SPELL_ENUM, Spell*>& getSpellBook() const;
        const int getManaPoints() const;
        const int getManaPointsLimit() const;
        const bool getIsBattle() const;
        const void showSpellBook() const;
        
        void addManaPoints(int mp);
        void spendManaPoints(int mp);
        
        virtual void castSpell(Unit* other, SPELL_ENUM spell);
};

std::ostream& operator<<(std::ostream& out, const Spellcaster& spellcaster);

#endif //SPELLCASTER_H
