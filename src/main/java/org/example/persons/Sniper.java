package org.example.persons;

import org.example.models.Archer;
import org.example.models.Person;

import java.util.ArrayList;

public class Sniper extends Archer {

    public Sniper(String name, int x, int y) {
        super(name, false, false, true, 100, 100, 1, new int[]{5, 10}, x, y);
        super.maxArrows = super.currentArrows = 10;
    }

    @Override
    public String toString() {
        return "Sniper: " + super.toString();
    }

    @Override
    public void step(Person target) {
        attack(target);
        replenishmentArrows(1);
        System.out.println(this.name + ": Step is done "  + getClass());
    }
}

