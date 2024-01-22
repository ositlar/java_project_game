package org.example.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Archer extends Person {

    protected int maxArrows;
    protected int currentArrows;
    public Archer(String name, boolean isMovable, boolean isMelee, boolean isMilitary, int maxHealth, int currentHealth, int healthRegen, int[] damage, int x, int y) {
        super(name, isMovable, isMelee, isMilitary, maxHealth, currentHealth, healthRegen, damage, x, y, 3);
    }

    public void attack(Person person) {
        Random rnd = new Random();
        int damage = rnd.nextInt(this.damage[0], this.damage[1] + 1);
        if (this.currentArrows > 0 && this.currentHealth > 0) {
            person.getDamage(damage);
            this.currentArrows--;
        }
    }

    public void replenishmentArrows(int arrows) {
        if (this.currentArrows + arrows > this.maxArrows) {
            this.currentArrows = this.maxArrows;
        } else {
            this.currentArrows += arrows;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "currentArrows=" + currentArrows +
                ", name='" + name + '\'' +
                ", currentHealth=" + currentHealth +
                ", damage=" + Arrays.toString(damage) +
                ", position=" + position +
                ", team=" + team +
                '}';
    }



    @Override
    public void step(Person target) {
        attack(target);
        replenishmentArrows(1);
        System.out.println(this.name + ": Step is done(Archer)");
    }

}
