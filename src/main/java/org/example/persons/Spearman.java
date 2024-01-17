package org.example.persons;

import org.example.models.Infantry;
import org.example.models.Person;

public class Spearman extends Infantry {
    public Spearman(String name, int x, int y) {
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
        this.team = 1;
    }
    @Override
    public String toString() {
        return "Spearman{" + name + '}' + position;
    }

    @Override
    public void step(Person target) {
        //Step...
    }
}
