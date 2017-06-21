#ifndef NECROMANSER_H
#define NECROMANSER_H

#include "Spellcaster.h"

class Necromanser : public Spellcaster {
    public:
        Necromanser(std::string nickName, int damage=20, int hitPoints=140, int manaPoints=110, std::string title="Necromanser");
        virtual ~Necromanser();

        virtual void attack(Unit* enemy);
        virtual void update(Subject* enemy);
};

#endif //NECROMANSER_H
