package org.example.persons;

import org.example.models.Person;

public class Spearman extends Person {
    public Spearman(String name) {
        super(name,
                true,
                true,
                true,
                150,
                0,
                150,
                0,
                0,
                0,
                new int[]{12, 15});
    }
    @Override
    public String toString() {
        return "Spearman{" + name + '}';
    }
}
