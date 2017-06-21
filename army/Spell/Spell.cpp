#include "Spell.h"

Spell::Spell(std::string spellName, int actionPoints, int manaCost) : spellName(spellName), actionPoints(actionPoints), manaCost(manaCost) {}

Spell::~Spell() {} 

const int Spell::getManaCost() const {
    return this->manaCost;
}

const int Spell::getActionPoints() const {
    return this->actionPoints;
}

const std::string& Spell::getSpellName() const {
    return this->spellName;
}

void Spell::cast(Spellcaster* caster, Unit* other, Spell* spell) {
    spell->cast(caster, other, spell);
}

std::ostream& operator<<(std::ostream& out, const Spell& spell) {
    out << spell.getSpellName() << ": Spellpower - " << spell.getActionPoints() << ", Manacost - " << spell.getManaCost() << ";";
    
    return out;
}
