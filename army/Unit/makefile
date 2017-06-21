all: test.out

test.out: main.o Spellcaster.o Wizard.o Unit.o State.o Spell.o Ability.o Subject.o Observer.o Soldier.o Rogue.o Berserk.o Vampire.o Werewolf.o Healer.o Priest.o Demon.o Warlock.o Necromanser.o FireBall.o Heal.o WolfState.o NormalAttack.o DefaultAttack.o AttackRogue.o AttackVampire.o AttackPriest.o 
	g++ -o test.out Spellcaster.o main.o Wizard.o Unit.o State.o Spell.o Ability.o Subject.o Observer.o Soldier.o Rogue.o Berserk.o Vampire.o Werewolf.o Healer.o Priest.o Demon.o Warlock.o Necromanser.o FireBall.o Heal.o WolfState.o NormalAttack.o DefaultAttack.o AttackRogue.o AttackVampire.o AttackPriest.o && ./test.out

NormalAttack.o:
	g++ -c ../Attack/NormalAttack.cpp

DefaultAttack.o:
	g++ -c ../Attack/DefaultAttack.cpp

AttackRogue.o:
	g++ -c ../Attack/AttackRogue.cpp

AttackPriest.o:
	g++ -c ../Attack/AttackPriest.cpp

AttackVampire.o:
	g++ -c ../Attack/AttackVampire.cpp

main.o:
	g++ -c main.cpp

Wizard.o:
	g++ -c Wizard.cpp

FireBall.o:
	g++ -c ../Spell/FireBall.cpp

Heal.o:
	g++ -c ../Spell/Heal.cpp

Necromanser.o:
	g++ -c Necromanser.cpp

Warlock.o:
	g++ -c Warlock.cpp

Demon.o:
	g++ -c Demon.cpp

Healer.o:
	g++ -c Healer.cpp

Priest.o:
	g++ -c Priest.cpp

Werewolf.o:
	g++ -c Werewolf.cpp

Vampire.o:
	g++ -c Vampire.cpp

Berserk.o:
	g++ -c Berserk.cpp

Rogue.o:
	g++ -c Rogue.cpp

Soldier.o:
	g++ -c Soldier.cpp

Ability.o:
	g++ -c Ability.cpp

Observer.o:
	g++ -c Observer.cpp

Subject.o:
	g++ -c Subject.cpp

Unit.o:
	g++ -c Unit.cpp

Spell.o:
	g++ -c ../Spell/Spell.cpp

Spellcaster.o:
	g++ -c Spellcaster.cpp

State.o:
	g++ -c ../State/State.cpp

WolfState.o:
	g++ -c ../State/WolfState.cpp

clean:
	rm -f *.o && clear
