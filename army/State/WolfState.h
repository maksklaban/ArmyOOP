#ifndef WOLFSTATE_H
#define WOLFSTATE_H

#include "State.h"

class WolfState : public State {
    public:
        WolfState(int hitPoints, int damage, std::string title="WolfForm");
        virtual ~WolfState();

        virtual void takeMagDamage(int dmg);
};

#endif //WOLFSTATE_H
