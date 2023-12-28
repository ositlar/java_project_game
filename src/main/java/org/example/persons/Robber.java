package org.example.persons;

public class Robber extends Person{
    public Robber(String name) {
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
        return "Robber{" + name + '}';
    }
}
