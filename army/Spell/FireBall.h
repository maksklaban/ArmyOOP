#ifndef FIREBALL_H
#define FIREBALL_H

#include "Spell.h"
#include "../Unit/Spellcaster.h"

class Spellcaster;

class FireBall : public Spell {
    protected:
        void priestCast(Spellcaster* caster, Unit* enemy, Spell* spell);
        void necromanserCast(Spellcaster* caster, Unit* enemy, Spell* spell);

    public:
        FireBall(std::string spellName="FireBall", int manaCost=30, int actionsPoints=40);
        virtual ~FireBall();

        virtual void cast(Spellcaster* caster, Unit* enemy, Spell* spell);
};

#endif //FIREBALL_H
