#include "Spellcaster.h"

Spellcaster::Spellcaster(std::string nickName, int damage, int hitPoints, int manaPoints, std::string title, bool isBattle, bool isUndead) : Unit(nickName, damage, hitPoints, title, isUndead, false, false), manaPoints(manaPoints), manaPointsLimit(manaPoints), isBattle(isBattle) {
    this->spellBook = new std::map<SPELL_ENUM, Spell*>();
    this->spellBook->insert(std::pair<SPELL_ENUM, Spell*>(FIREBALL, new FireBall()));
    this->spellBook->insert(std::pair<SPELL_ENUM, Spell*>(HEAL, new Heal()));
}

Spellcaster::~Spellcaster() {
    std::map<SPELL_ENUM, Spell*>::iterator it;

    for ( it = this->spellBook->begin(); it != this->spellBook->end(); it++ ) {
        delete it->second;
    }

    delete spellBook;
}

const int Spellcaster::getManaPoints() const {
    return this->manaPoints;
}

const int Spellcaster::getManaPointsLimit() const {
    return this->manaPointsLimit;
}

const std::map<SPELL_ENUM, Spell*>& Spellcaster::getSpellBook() const {
    return *(this->spellBook);
}

const bool Spellcaster::getIsBattle() const {
    return this->isBattle;
}

void Spellcaster::ensureIsAlive() {
    if ( Unit::getHitPoints() == 0 ) {
        throw NoHitPointsException();
    }
}

const void Spellcaster::showSpellBook() const {
    std::map<SPELL_ENUM, Spell*>::iterator it;
    
    std::cout << "Current spellbook: ";
    
    for ( it = this->spellBook->begin(); it != this->spellBook->end(); it++ ) {
        std::cout << std::endl << *it->second;
    }
}

void Spellcaster::addManaPoints(int mp) {
    this->ensureIsAlive();
    
    int total = this->manaPoints + mp;
    
    if ( total > this->manaPointsLimit ) {
        this->manaPoints = this->manaPointsLimit;
        return;
    }
    
    this->manaPoints = total;
}

void Spellcaster::spendManaPoints(int mp) {
    this->ensureIsAlive();
    
    if ( mp > this->manaPoints ) {
        throw NoManaPointsException();
    }
    
    this->manaPoints -= mp;
}

void Spellcaster::castSpell(Unit* other, SPELL_ENUM spell) {
    std::map<SPELL_ENUM, Spell*>::iterator it = this->spellBook->find(spell);

    if ( it == spellBook->end() ) {
        throw SpellIsNotAvaibleException();
    }

    it->second->Spell::cast(this, other, it->second);
}

std::ostream& operator<<(std::ostream& out, const Spellcaster& spellcaster) {
    out << (Unit)spellcaster << ", ManaPoints " << spellcaster.getManaPoints() << "/" << spellcaster.getManaPointsLimit() << std::endl;
    spellcaster.showSpellBook();
    
    return out;
}
