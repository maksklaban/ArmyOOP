all: test.out

test.out: main.o Spellcaster.o Wizard.o test_Wizard.o Unit.o State.o Spell.o Ability.o Observer.o Subject.o Soldier.o Rogue.o Berserk.o Vampire.o Werewolf.o Healer.o Priest.o Demon.o Warlock.o Necromanser.o Heal.o FireBall.o WolfState.o DefaultAttack.o NormalAttack.o AttackRogue.o AttackPriest.o AttackVampire.o
	g++ -o test.out Spellcaster.o main.o Wizard.o test_Wizard.o Unit.o State.o Spell.o Ability.o Subject.o Observer.o Soldier.o Rogue.o Berserk.o Vampire.o Werewolf.o Healer.o Priest.o Demon.o Warlock.o Necromanser.o FireBall.o Heal.o WolfState.o DefaultAttack.o NormalAttack.o AttackRogue.o AttackPriest.o AttackVampire.o && ./test.out

main.o:
	g++ -c main.cpp

test_Wizard.o:
	g++ -c test_Wizard.cpp

DefaultAttack.o:
	g++ -c ../../Attack/DefaultAttack.cpp

AttackRogue.o:
	g++ -c ../../Attack/AttackRogue.cpp

AttackVampire.o:
	g++ -c ../../Attack/AttackVampire.cpp

AttackPriest.o:
	g++ -c ../../Attack/AttackPriest.cpp

NormalAttack.o:
	g++ -c ../../Attack/NormalAttack.cpp

Priest.o:
	g++ -c ../Priest.cpp

Necromanser.o:
	g++ -c ../Necromanser.cpp

Warlock.o:
	g++ -c ../Warlock.cpp

Demon.o:
	g++ -c ../Demon.cpp

Wizard.o:
	g++ -c ../Wizard.cpp

Healer.o:
	g++ -c ../Healer.cpp

Werewolf.o:
	g++ -c ../Werewolf.cpp

Vampire.o:
	g++ -c ../Vampire.cpp

Berserk.o:
	g++ -c ../Berserk.cpp

Soldier.o:
	g++ -c ../Soldier.cpp

Rogue.o:
	g++ -c ../Rogue.cpp

Observer.o:
	g++ -c ../Observer.cpp

Subject.o:
	g++ -c ../Subject.cpp

Ability.o:
	g++ -c ../Ability.cpp

Unit.o:
	g++ -c ../Unit.cpp

Spell.o:
	g++ -c ../../Spell/Spell.cpp

FireBall.o:
	g++ -c ../../Spell/FireBall.cpp

Heal.o:
	g++ -c ../../Spell/Heal.cpp

Spellcaster.o:
	g++ -c ../Spellcaster.cpp

State.o:
	g++ -c ../../State/State.cpp

WolfState.o:
	g++ -c ../../State/WolfState.cpp

clean:
	rm -f *.o && clear
