package org.example.models;

import org.example.Coordinates;

import java.util.Random;

public abstract class Person implements IGame {
    protected String name;
    protected boolean isMovable, isMelee, isMilitary;
    protected int maxHealth, currentHealth, healthRegen;
    protected int[] damage;
    protected Coordinates position;
    protected byte team;

    protected byte initiative;

    public Person(String name, boolean isMovable, boolean isMelee, boolean isMilitary, int maxHealth, int currentHealth, int healthRegen, int[] damage, int x, int y, int initiative) {
        this.name = name;
        this.isMovable = isMovable;
        this.isMelee = isMelee;
        this.isMilitary = isMilitary;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.healthRegen = healthRegen;
        this.damage = damage;
        this.position = new Coordinates(x, y);
        this.initiative = (byte) initiative;
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

    public void getDamage(int damage) {
        if (currentHealth - damage > 0) {
            currentHealth -= damage;
            System.out.println(name + ": " + currentHealth + " (-" + damage + ')');
        } else {
            currentHealth = 0;
            System.out.println(name + ": " + currentHealth + " (-" + damage + ')');
        }
    }

    public void getHeal(int heal) {
        if (currentHealth + heal < maxHealth) {
            currentHealth += heal;
            System.out.println(name + ": " + currentHealth + " (+" + heal + ')');
        } else {
            currentHealth = maxHealth;
            System.out.println(name + ": " + currentHealth + " (+" + heal + ')');
        }
    }

    @Override
    public void step(Person target) {

    }

    public byte getInitiative() {
        return initiative;
    }
}
