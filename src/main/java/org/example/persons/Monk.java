package org.example.persons;

public class Monk extends Person {
    public Monk(String name) {
        super(name,
                false,
                false,
                true,
                90,
                1000,
                90,
                1000,
                0,
                0,
                new int[]{-10, -8});
    }

    @Override
    public String toString() {
        return "Monk{" + name + '}';
    }
}
