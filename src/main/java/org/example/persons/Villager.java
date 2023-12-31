package org.example.persons;

import org.example.models.Person;

public class Villager extends Person {

    public Villager(String name, int x, int y, byte team) {
        super(name,
                true,
                false,
                false,
                70,
                70,
                5,
                new int[]{0},
                x,
                y);
        this.team = team;
    }
    @Override
    public String toString() {
        return "Villager{" + name + '}' + position;
    }
}
