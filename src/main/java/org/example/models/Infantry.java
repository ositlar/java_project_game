package org.example.models;

import java.util.Random;

public abstract class Infantry extends Person implements IGame {


    public Infantry(String name, boolean isMovable, boolean isMelee, boolean isMilitary, int maxHealth, int currentHealth, int healthRegen, int[] damage, int x, int y) {
        super(name, isMovable, isMelee, isMilitary, maxHealth, currentHealth, healthRegen, damage, x, y, 2);
    }

    public void attack(Person target) {
        Random rnd = new Random();
        int damage = rnd.nextInt(this.damage[0], this.damage[1] + 1);
        target.getDamage(damage);
    }
}
