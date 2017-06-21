package com.maksklaban.armymax.units;

import com.maksklaban.armymax.exceptions.*;

public class Werewolf extends Unit {
    public Werewolf(String nickName, int damage, int hitPoints, String title) throws CloneNotSupportedException {
        super(nickName, damage, hitPoints, title, false, false, true);
    }

    public Werewolf(String nickName) throws CloneNotSupportedException {
        this(nickName, 25, 200, "Werewolf");
    }

    public void transformInToWolf() throws ArmyException {
        int temp = this.getHitPoints() + (this.getHitPoints() / 2);

        this.state = this.wolfState;
        this.state.setCurrentHp(temp);
    }

    public void transformBack() throws ArmyException {
        int temp = this.getHitPoints() - (this.getHitPoints() / 2);
        
        this.state = this.normalState;
        this.state.setCurrentHp(temp);
    }
}
