package org.example.persons;

import org.example.models.Person;

public class Robber extends Person {
    public Robber(String name, int x, int y) {
        super(name,
                true,
                true,
                true,
                150,
                150,
                10,
                new int[]{12, 15},
                x,
                y);
        this.team = 0;
    }
    @Override
    public String toString() {
        return "Robber{" + name + '}' + position;
    }
}
