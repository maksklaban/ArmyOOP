package com.maksklaban.armymax.state;

import com.maksklaban.armymax.exceptions.*;

public class WolfState extends State {
    public WolfState(int hitPoints, int damage, String title) {
        super(hitPoints + (hitPoints / 2), damage * 2, title);
    }

    public WolfState(int hitPoints, int damage) {
        this(hitPoints, damage, "WolfForm");
    }

    public void takeMagDamage(int hp) throws ArmyException {
        super.takeMagDamage(hp*2);
    }

}
