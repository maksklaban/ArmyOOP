package com.maksklaban.armymax.units;

import com.maksklaban.armymax.exceptions.*;

public class Ability {
    protected boolean isWerewolf;
    protected boolean isVampire;

    public Ability(boolean isVampire, boolean isWerewolf) {
        this.isWerewolf = isWerewolf;
        this.isVampire = isVampire;
    }

    public Ability() {
        this(false, false);
    }

    public boolean getIsWerewolf() {
        return this.isWerewolf;
    }

    public boolean getIsVampire() {
        return this.isVampire;
    }

    public void turnToVampire(Ability other) throws ArmyException {
        if ( this.isVampire && !(other.getIsVampire()) && !(other.getIsWerewolf()) ) {
            other.isVampire = !(other.isVampire); 
        } else {
            throw new CantTurnThisUnitException();
        }
    }

    public void turnToWerewolf(Ability other) throws ArmyException {
        if ( this.isWerewolf && !(other.getIsVampire()) && !(other.getIsWerewolf()) ) {
            other.isWerewolf = !(other.isWerewolf); 
        } else {
            throw new CantTurnThisUnitException();
        }
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
    
        if ( this.isWerewolf || this.isVampire ) {
            out.append("(Unit has a " + (this.isWerewolf ? "werewolf abilities)" : "vampire abilities) "));
        }

        return out.toString();
    }
}
