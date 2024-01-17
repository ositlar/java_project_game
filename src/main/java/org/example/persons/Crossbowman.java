package org.example.persons;

import org.example.models.Archer;
import org.example.models.Person;

public class Crossbowman extends Archer {
    public Crossbowman(String name, int x, int y) {
        super(name, false, false, true, 110, 110, 1, new int[]{6, 9}, x, y);
        super.maxArrows = super.currentArrows = 10;
    }

    @Override
    public String toString() {
        return "Archer: " + super.toString();
    }
    @Override
    public void step(Person target) {
        attack(target);
        replenishmentArrows(1);
        System.out.println(this.name + ": Step is done " + getClass());
    }
}
