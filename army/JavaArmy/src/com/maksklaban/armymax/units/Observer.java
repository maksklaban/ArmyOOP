package com.maksklaban.armymax.units;

import com.maksklaban.armymax.exceptions.*;

public interface Observer {
    public void update(Unit another) throws ArmyException;
}
