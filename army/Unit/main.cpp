#include "Wizard.h"
#include "Soldier.h"
#include "Rogue.h"
#include "Berserk.h"
#include "Vampire.h"
#include "Werewolf.h"
#include "Healer.h"
#include "Priest.h"
#include "Demon.h"
#include "Warlock.h"
#include "Necromanser.h"

int main() {
    // Spell *spell = new Spell();
    Wizard *wizard = new Wizard("Nagibator");
    Soldier *soldier = new Soldier("BANYA");
    Soldier *soldier1 = new Soldier("BANYA");
    Rogue *rogue = new Rogue("PETYA");
    Berserk *berserk = new Berserk("BEZUMEC");
    Vampire *vampire = new Vampire("BEZUMECKA");
    Werewolf *werewolf = new Werewolf("Shuchka");
    Healer *healer = new Healer("Hilka");
    Priest *priest = new Priest("Hilka");
    Warlock *warlock = new Warlock("gulDan");
    Demon *demon = warlock->summonDemon();
    Necromanser *necromanser = new Necromanser("Lich");


    // necromanser->attack(priest);
    
    std::cout << *vampire << std::endl;
    vampire->turnInVampire(soldier);


    priest->attack(priest, soldier);
    std::cout << *soldier << std::endl;
    soldier->getVampireAttack();
    soldier->attack(soldier, priest);
    // std::cout << *vampire << std::endl;
    // std::cout << *priest << std::endl;  
    // std::cout << *vampire << std::endl;
    // vampire->attack(vampire, priest);
    // std::cout << *vampire << std::endl;
    // std::cout << *priest << std::endl;  
    // soldier->attack(soldier, rogue);
    
    std::cout << *soldier << std::endl;
    soldier->getNormalAttack();
    soldier->attack(soldier, priest);
    std::cout << *soldier << std::endl;
    // std::cout << *rogue << std::endl;
    // std::cout << *soldier1 << std::endl;
    // std::cout << *priest << std::endl;  
    // std::cout << *necromanser << std::endl;
    // priest->castSpell(necromanser, FIREBALL);
    // std::cout << *necromanser << std::endl;
    // necromanser->castSpell(priest, FIREBALL);
    // necromanser->castSpell(priest, HEAL);

    // std::cout << *necromanser << std::endl;
    // priest->notify();
    // std::cout << *priest << std::endl;  

    // std::cout << necromanser->getHitPoints() << std::endl;
    // std::cout << *necromanser << std::endl;
    // std::cout << *wizard << std::endl;
    // std::cout << *warlock << std::endl;
    // // delete warlock;
    // std::cout << *demon << std::endl;
    // std::cout << *healer << std::endl;
    // std::cout << *priest << std::endl;
    // delete necromanser;
    // std::cout << *berserk << std::endl;
    // std::cout << *rogue << std::endl;
    // std::cout << *vampire << std::endl;

    // vampire->turnInVampire(soldier);
    
    // // std::cout << *soldier << std::endl;
    // std::cout << *werewolf << std::endl;
    // werewolf->transformInToWolf
    // werewolf->turnInWerewolf(rogue);
    // werewolf->turnInWerewolf(rogue);
    
    // std::cout << *rogue << std::endl;
    // necromanser->castSpell(werewolf, FIREBALL);

    // werewolf->transformInToWolf();
    // rogue->transformInToWolf();
    // std::cout << *werewolf << std::endl;
    // werewolf->transformInToWolf();
    // necromanser->castSpell(werewolf, FIREBALL);

    // werewolf->transformBack();
    // std::cout << *rogue << std::endl;
    // std::cout << *werewolf << std::endl;
    return 0;
}
