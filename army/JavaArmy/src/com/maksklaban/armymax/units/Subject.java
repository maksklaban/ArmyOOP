package com.maksklaban.armymax.units;

import com.maksklaban.armymax.exceptions.*;

public interface Subject {
    public void attach(Unit another);
    public void notifyObserver() throws ArmyException;
}
