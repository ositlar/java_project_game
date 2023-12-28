package org.example.persons;

import org.example.models.Person;

public class Sniper extends Person {
    public Sniper(String name) {
        super(name,
                true,
                false,
                true,
                100,
                10,
                100,
                10,
                0,
                0,
                new int[]{10, 13});
    }
    @Override
    public String toString() {
        return "Sniper{" + name + '}';
    }
}
