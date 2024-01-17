package org.example.persons;

import org.example.models.Person;
import org.example.models.Wizard;

public class Monk extends Wizard {
    public Monk(String name, int x, int y) {
        super(name,
                false,
                false,
                true,
                90,
                90,
                6,
                new int[]{-10, -8},
                x,
                y);
        this.team = 0;
    }

    @Override
    public String toString() {
        return "Monk{" + name + '}' + position;
    }

    @Override
    public void step(Person target) {
        //Step...
    }
}
