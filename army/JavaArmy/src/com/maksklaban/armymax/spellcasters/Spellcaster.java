package com.maksklaban.armymax.spellcasters;

import com.maksklaban.armymax.units.*;
import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.attack.*;
import com.maksklaban.armymax.spell.*;
import java.util.*;

public class Spellcaster extends Unit {
    protected Map<Spells, Spell> spellBook;
    protected int manaPoints;
    protected int manaPointsLimit;
    protected boolean isBattle;

    protected void ensureIsAlive() throws ArmyException {
        if ( this.getHitPoints() == 0 ) {
            throw new NoHitPointsException();
        }
    }

    public Spellcaster(String nickName, int damage, int hitPoints, int manaPoints, String title, boolean isBattle, boolean isUndead) throws CloneNotSupportedException {
        super(nickName, damage, hitPoints, title, isUndead);
        this.spellBook = new HashMap<Spells, Spell>();
        this.manaPoints = manaPoints;
        this.manaPointsLimit = manaPoints;
        this.isBattle = isBattle;
        this.spellBook.put(Spells.FIREBALL, new FireBall());
        this.spellBook.put(Spells.HEAL, new Heal());
    }

    public Spellcaster(String nickName, int damage, int hitPoints, int manaPoints, String title, boolean isBattle) throws CloneNotSupportedException {
        this(nickName, damage, hitPoints, manaPoints, title, isBattle, false);
    }

    public int getManaPoints() {
        return this.manaPoints;
    }

    public int getManaPointsLimit() {
        return this.manaPointsLimit;
    }

    public Map getSpellBook() {
        return this.spellBook;
    }

    public boolean getIsBattle() {
        return this.isBattle;
    }

    public void addManaPoints(int mp) throws ArmyException {
        this.ensureIsAlive();

        int total = this.manaPoints + mp;
    
        if ( total > this.manaPointsLimit ) {
            this.manaPoints = this.manaPointsLimit;
            return;
        }
        
        this.manaPoints = total;
    }

    public void spendManaPoints(int mp) throws ArmyException{
        this.ensureIsAlive();
        
        if ( mp > this.manaPoints ) {
            throw new NoManaPointsException();
        }
        
        this.manaPoints -= mp;
    }

    public void castSpell(Unit other, Spells spell) throws ArmyException {
        Spell temp = (Spell)this.spellBook.get(spell);

        if ( temp == null ) {
            throw new SpellIsNotAvaibleException();
        }

        temp.cast(this, other, temp);
    }

    public String toString() {
        StringBuilder out = new StringBuilder(super.toString());
        out.append(", Manapoints " + this.getManaPoints() + "/" + this.getManaPointsLimit() + "\n" + "Current spellbook:");

        Set<Spells> temp = this.spellBook.keySet();
        Iterator it = temp.iterator();

        for ( ; it.hasNext(); ) {
            Spells buff = (Spells)it.next();

            out.append("\n" + (Spell)spellBook.get((buff)));
        }

        return out.toString();
    }
}