package com.maksklaban.armymax.state;

import com.maksklaban.armymax.exceptions.*;

public class State implements Cloneable {
    protected int hitPoints;
    protected int hitPointsLimit;
    protected int damage;
    protected String title;

    protected void ensureIsAlive() throws ArmyException {
        if ( this.hitPoints == 0 ) {
            throw new NoHitPointsException();
        }
    }

public State(int hitPoints, int damage, String title) {
    this.hitPoints = hitPoints;
    this.hitPointsLimit = hitPoints;
    this.damage = damage;
    this.title = title;
}

public int getHitPoints() {
    return this.hitPoints;
}

public int getHitPointsLimit() {
    return this.hitPointsLimit;
}

public int getDamage() {
    return this.damage;
}

public String getTitle() {
    return this.title;
}

public void setCurrentHp(int hp) throws ArmyException {
    this.ensureIsAlive();

    if ( hp < this.getHitPointsLimit() && hp > 0 ) {
        this.hitPoints = hp;
    }
}

public void addHitPoints(int hp) throws ArmyException {
    this.ensureIsAlive();

    int total = this.hitPoints + hp;

    if ( total > hitPointsLimit ) {
        this.hitPoints = this.hitPointsLimit;
        return;
    }

    this.hitPoints = total;
}

public void takeDamage(int dmg) throws ArmyException {
    this.ensureIsAlive();

    if ( dmg > this.hitPoints ) {
        this.hitPoints = 0;
        return;
    }

    this.hitPoints -= dmg;
}

public void takeMagDamage(int dmg) throws ArmyException {
    this.takeDamage(dmg);
}

public State clone() throws CloneNotSupportedException {
    return (State) super.clone();
}

public String toString() {
    StringBuilder out = new StringBuilder("- ");
    out.append(this.title + ", HP " + this.hitPoints + "/" + this.hitPointsLimit + ", Damage " + this.damage);

    return out.toString();
    }

}
