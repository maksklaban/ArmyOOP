#include "Heal.h"

Heal::Heal(std::string spellName, int manaCost, int actionPoints) : Spell(spellName, actionPoints, manaCost) {}

Heal::~Heal() {}

void Heal::cast(Spellcaster* caster, Unit* other, Spell* spell) {
    caster->spendManaPoints(this->getManaCost());

    if ( caster->getIsBattle() ) {
        other->addHitPoints(spell->getActionPoints() / 2);
    } else {
        other->addHitPoints(spell->getActionPoints());
    }
}
