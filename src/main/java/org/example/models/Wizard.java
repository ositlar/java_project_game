package org.example.models;

import java.util.Random;

public abstract class Wizard extends Person{
    public Wizard(String name, boolean isMovable, boolean isMelee, boolean isMilitary, int maxHealth, int currentHealth, int healthRegen, int[] damage, int x, int y) {
        super(name, isMovable, isMelee, isMilitary, maxHealth, currentHealth, healthRegen, damage, x, y, 1);
    }
    public void heal(Person person) {
        Random rnd = new Random();
        int heal = rnd.nextInt(this.damage[0], this.damage[1] + 1);
        if (person.currentHealth + heal > person.maxHealth) {
            person.currentHealth = person.maxHealth;
        } else {
            person.currentHealth += heal;
        }
    }
}
