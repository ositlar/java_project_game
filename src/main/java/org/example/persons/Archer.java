package org.example.persons;

import org.example.Coordinates;
import org.example.models.Person;

import java.util.ArrayList;
import java.util.Comparator;

public class Archer extends Person {
    public Archer(String name, int x, int y) {
        super(name,
                true,
                false,
                true,
                100,
                100,
                7,
                new int[]{10, 13},
                x,
                y);
        this.team = 0;
    }

    @Override
    public String toString() {
        return "Archer{" + name + '}' + position;
    }

    public Person getClosestTarget(ArrayList<Person> enemies) {
        double min = 0;
        double temp = 0;
        Person result = null;
        for (int i = 0; i < enemies.size(); i++) {
            temp = this.position.getDistance(enemies.get(i).getPosition());
            if (temp < min) {
                min = temp;
                result = enemies.get(i);
            }
        }
        return result;
    }
}
