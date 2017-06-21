#include "FireBall.h"

FireBall::FireBall(std::string spellName, int manaCost, int actionPoints) : Spell(spellName, actionPoints, manaCost) {}

FireBall::~FireBall() {}

void FireBall::cast(Spellcaster* caster, Unit* enemy, Spell* spell) {
    caster->spendManaPoints(this->getManaCost());

    if ( caster->getTitle() == "Priest" ) {
        this->priestCast(caster, enemy, spell);
    } else if ( caster->getTitle() == "Necromanser" ) {
        this->necromanserCast(caster, enemy, spell);
    } else {
        if ( caster->getIsBattle() ) {
            enemy->takeMagDamage(spell->getActionPoints());
        } else {
            enemy->takeMagDamage(spell->getActionPoints() / 2);
            }
        }
}

void FireBall::priestCast(Spellcaster* caster, Unit* enemy, Spell* spell) {
    if ( enemy->getIsUndead() ) {
        enemy->takeMagDamage(spell->getActionPoints());
    } else {
        enemy->takeMagDamage(spell->getActionPoints() / 2);
    }
}

void FireBall::necromanserCast(Spellcaster* caster, Unit* enemy, Spell* spell) {
    enemy->takeMagDamage(spell->getActionPoints());
    caster->addSubject(enemy);
}
