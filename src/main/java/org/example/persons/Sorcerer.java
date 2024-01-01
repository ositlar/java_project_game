package org.example.persons;

import org.example.models.Person;

public class Sorcerer extends Person {
    public Sorcerer(String name, int x, int y) {
        super(name,
                false,
                false,
                true,
                90,
                90,
                8,
                new int[]{-10, -8},
                x,
                y);
        this.team = 1;

    }
    @Override
    public String toString() {
        return "Sorcerer{" + name + '}' + position;
    }
}
