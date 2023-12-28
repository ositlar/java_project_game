package org.example.persons;

import org.example.models.Person;

public class Villager extends Person {

    public Villager(String name) {
        super(name,
                true,
                false,
                false,
                70,
                1,
                70,
                1,
                0,
                0,
                new int[]{0}
        );
    }
    @Override
    public String toString() {
        return "Villager{" + name + '}';
    }
}
