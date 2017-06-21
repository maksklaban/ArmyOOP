package com.maksklaban.armymax;

import com.maksklaban.armymax.units.*;
import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.spellcasters.*;
import com.maksklaban.armymax.attack.*;
import com.maksklaban.armymax.spell.*;

public class ArmyMain {
    public static void main(String args[]) throws CloneNotSupportedException, ArmyException {
        Soldier soldier = new Soldier("asdas1");
        Wizard wizard = new Wizard("Wiz");
        Healer healer = new Healer("Hil");
        Priest priest = new Priest("Kirill");
        Warlock warlock = new Warlock("Kirill");
        Necromanser necr = new Necromanser("adsa");
        Rogue rogue = new Rogue("Sdad");
        Berserk bers = new Berserk("sdad");
        Werewolf werewolf = new Werewolf("sdassd");
        Vampire vamp = new Vampire("ADS");


        priest.castSpell(vamp, Spells.FIREBALL);

        // Demon demon = warlock.summonDemon();
        // System.out.println(rogue);
        System.out.println(vamp);
        // System.out.println(werewolf);
        // System.out.println(healer);
        // System.out.println(bers);
        priest.attack(priest, necr);
        System.out.println(necr);
        // healer.castSpell(werewolf, Spells.FIREBALL);
        // healer.castSpell(werewolf, Spells.FIREBALL);
        // werewolf.transformInToWolf();
        // healer.castSpell(werewolf, Spells.FIREBALL);
        // healer.castSpell(werewolf, Spells.FIREBALL);
        // vamp.attack(vamp, healer);
        // vamp.turnToVampire(healer);
        // System.out.println(healer);
        // healer.getVampireAttack();
        // healer.attack(healer, soldier);
        // System.out.println(healer);
        // healer.getNormalAttack();
        // healer.attack(healer, soldier);
        // System.out.println(healer);
        // healer.transformInToWolf();
        // System.out.println(healer);
        // System.out.println(bers);
        // System.out.println(werewolf);
        // System.out.println(wizard);
        // System.out.println(priest);
        // System.out.println(demon);
        // System.out.println(warlock);

        // warlock.takeDamage(200);
        // necr.attack(soldier);
        // priest.attack(necr);
        // System.out.println(demon);
        // demon.attack(soldier);
        // demon.attack(soldier);
        // demon.attack(soldier);
        // demon.attack(soldier);
        // demon.attack(soldier);
        // demon.attack(soldier);
        // demon.attack(soldier);
        // System.out.println(soldier);
        // soldier.takeDamage(200);
        // System.out.println(soldier);
        // System.out.println(necr);
        // priest.castSpell(soldier, Spells.FIREBALL);
        // System.out.println(soldier);
        // wizard.castSpell(soldier, Spells.HEAL);
        // healer.castSpell(soldier, Spells.HEAL);
        // // System.out.println(soldier.getHitPoints());
        // System.out.println(healer);
        // System.out.println(soldier);
        // System.out.println(wizard);
    }
}