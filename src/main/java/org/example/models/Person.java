package org.example.models;

import java.util.Random;

public abstract class Person {
    protected String name;
    protected boolean isMovable;
    protected boolean isMelee;
    protected boolean isMilitary;
    protected int maxHealth;
    protected int currentHealth;
    protected int currentAbility;
    protected int healthRegen;
    protected int[] damage;

    public Person(String name, boolean isMovable, boolean isMelee, boolean isMilitary, int maxHealth, int maxAbility, int currentHealth, int currentAbility, int abilityRegen, int healthRegen, int[] damage) {
        this.name = name;
        this.isMovable = isMovable;
        this.isMelee = isMelee;
        this.isMilitary = isMilitary;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.currentAbility = currentAbility;
        this.healthRegen = healthRegen;
        this.damage = damage;
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
}
