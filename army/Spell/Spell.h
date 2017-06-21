#ifndef SPELL_H
#define SPELL_H

#include <iostream>
#include "../exception.h"
#include "../Unit/Unit.h"

class Spellcaster;

enum SPELL_ENUM {
    FIREBALL,
    HEAL
};

class Spell {
    protected:
        int actionPoints;
        int manaCost;
        std::string spellName;
        
    public:
        Spell(std::string spellName, int actionPoints, int manaCost);
        virtual ~Spell();
        
        const int getManaCost() const;
        const int getActionPoints() const;
        const std::string& getSpellName() const;

        virtual void cast(Spellcaster* caster, Unit* other, Spell* spell) = 0;
};

std::ostream& operator<<(std::ostream& out, const Spell& spell);

#endif //SPELL_H
