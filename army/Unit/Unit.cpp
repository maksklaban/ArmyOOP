#include "Unit.h"

Unit::Unit(std::string nickName, int damage, int hitPoints, std::string title, bool isUndead, bool isVampire, bool isWerewolf) : nickName(nickName), isUndead(isUndead), physicalAttack(new DefaultAttack() ), state(new State(hitPoints, damage, title)), Ability(isVampire, isWerewolf), Subject(), Observer() {
    this->normalState = new State(hitPoints, damage, title);
    this->wolfState = new WolfState(hitPoints, damage, title);
}
 
Unit::~Unit() {
    delete this->normalState;
    delete this->wolfState;
    delete this->state;
    delete this->physicalAttack;
    delete this->temp;
}

const std::string& Unit::getNickName() const {
    return this->nickName;
}

const int Unit::getDamage() const {
    return this->state->getDamage();
}

const int Unit::getHitPoints() const {
    return this->state->getHitPoints();
}

const int Unit::getHitPointsLimit() const {
    return this->state->getHitPointsLimit();
}

const bool Unit::getIsUndead() const {
    return this->isUndead;
}

const std::string& Unit::getTitle() const {
    return this->state->getTitle();
}

const State& Unit::getState() const {
    return *(this->state);
}

void Unit::takeDamage(int dmg) {
    this->state->takeDamage(dmg);

    if ( this->getHitPoints() == 0 ) {
        this->notify();
    }
}

void Unit::takeMagDamage(int dmg) {
    this->state->takeMagDamage(dmg);
}

void Unit::takePhysicalDamage(int dmg) {
    this->takeDamage(dmg);
}

void Unit::addHitPoints(int hp) {
    this->state->addHitPoints(hp);
}

void Unit::turnInVampire(Unit* enemy) {
    Ability::turnInVampire(enemy);

    enemy->isUndead = true;
}

void Unit::transformInToWolf() {
    int temp = this->getHitPoints() * 1.5;

    if ( this->isWerewolf && this->getHitPoints() > 0 ) {
        this->state = this->wolfState;
        this->state->setCurrentHp(temp);
    } else {
        throw UnitCantTransformException();
    }
}

void Unit::transformBack() {
    int temp = this->getHitPoints() / 1.5;

    if ( this->getTitle() == "WolfForm" && this->getHitPoints() > 0 ) {
        this->state = this->normalState;
        this->state->setCurrentHp(temp);
    } else {
        throw UnitCantTransformException();
    }
}

void Unit::getVampireAttack() {
    if ( this->getIsVampire() ) {
        this->temp = this->physicalAttack;
        this->physicalAttack = new AttackVampire();
    } else {
        throw AbilityIsNotAvaibleException();
    }
}

void Unit::getNormalAttack() {
    if ( this->getIsVampire()) {
        delete this->physicalAttack;
        this->physicalAttack = this->temp;
    } else {
        throw AbilityIsNotAvaibleException();
    }
}

void Unit::attack(Unit* attacker, Unit* enemy) {
    this->physicalAttack->attack(this, enemy);
}

void Unit::counterAttack(Unit* attacker, Unit* enemy) {
    this->physicalAttack->counterAttack(this, enemy);
}

std::ostream& operator<<(std::ostream& out, const Unit& unit) {
    out << unit.getNickName() << " " << (Ability)unit << unit.getState();
    if ( unit.getIsUndead() ) {
        out << ", Undead";
    }
    return out;
}
