package org.example.persons;

import org.example.models.Infantry;
import org.example.models.Person;

public class Robber extends Infantry {
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

    @Override
    public void step(Person target) {
        //Step...
    }
}
