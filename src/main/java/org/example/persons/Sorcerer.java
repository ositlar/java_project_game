package org.example.persons;

import org.example.models.Person;

public class Sorcerer extends Person {
    public Sorcerer(String name) {
        super(name,
                false,
                false,
                true,
                90,
                1000,
                90,
                1000,
                0,
                0,
                new int[]{-10, -8});

    }
    @Override
    public String toString() {
        return "Sorcerer{" + name + '}';
    }
}
