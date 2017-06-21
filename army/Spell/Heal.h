#ifndef HEAL_H
#define HEAL_H

#include "Spell.h"
#include "../Unit/Spellcaster.h"

class Spellcaster;

class Heal : public Spell {
    public:
        Heal(std::string spellName="Heal", int manaCost=35, int actionsPoints=45);
        virtual ~Heal();

        virtual void cast(Spellcaster* caster, Unit* other, Spell* spell);
};

#endif //HEAL_H
