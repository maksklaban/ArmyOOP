package com.maksklaban.armymax.units;

public class Soldier extends Unit {
    public Soldier(String nickName, int damage, int hitPoints, String title) throws CloneNotSupportedException {
        super(nickName, damage, hitPoints, title);
    }

    public Soldier(String nickName) throws CloneNotSupportedException {
        this(nickName, 30, 200, "Soldier");
    }
}
