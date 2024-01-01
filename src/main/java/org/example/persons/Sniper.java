package org.example.persons;

import org.example.models.Person;

public class Sniper extends Person {
    public Sniper(String name, int x, int y) {
        super(name,
                true,
                false,
                true,
                100,
                100,
                9,
                new int[]{10, 13},
                x,
                y);
        this.team = 1;
    }
    @Override
    public String toString() {
        return "Sniper{" + name + '}' + position;
    }
}
