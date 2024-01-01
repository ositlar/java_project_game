package org.example.persons;

import org.example.models.Person;

public class Monk extends Person {
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
}
