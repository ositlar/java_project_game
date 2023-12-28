package org.example.persons;

public class Archer extends Person {
    public Archer(String name) {
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
        return "Archer{" + name + '}';
    }
}
