package com.maksklaban.armymax.attack;

import com.maksklaban.armymax.exceptions.*;
import com.maksklaban.armymax.state.*;
import com.maksklaban.armymax.units.*;

public abstract class NormalAttack {
    public abstract void attack(Unit attacker, Unit enemy) throws ArmyException;
    public abstract void counterAttack(Unit attacker, Unit enemy) throws ArmyException; 
}
