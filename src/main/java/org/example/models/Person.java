package org.example.models;

import org.example.Coordinates;

import java.util.Random;

public abstract class Person {
    protected String name;
    protected boolean isMovable, isMelee, isMilitary;
    protected int maxHealth, currentHealth, healthRegen;
    protected int[] damage;
    protected Coordinates position;
    protected byte team;

    public Person(String name, boolean isMovable, boolean isMelee, boolean isMilitary, int maxHealth, int currentHealth, int healthRegen, int[] damage, int x, int y) {
        this.name = name;
        this.isMovable = isMovable;
        this.isMelee = isMelee;
        this.isMilitary = isMilitary;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.healthRegen = healthRegen;
        this.damage = damage;
        this.position = new Coordinates(x, y);
    }

    public void attackPerson(Person target) {
        Random rnd = new Random();
        target.currentHealth -= rnd.nextInt(damage[0], damage[1] + 1);
    }

    public void healPerson(Person target) {
        Random rnd = new Random();
        int healEffect = rnd.nextInt(damage[0], damage[1]);
        if (target.maxHealth - target.currentHealth < healEffect) {
            target.currentHealth = target.maxHealth;
        } else {
            target.currentHealth += healEffect;
        }
    }

    public void reanimate(Person target) {
        target.currentHealth = 20;
    }

    public Coordinates getPosition() {
        return position;
    }
}
