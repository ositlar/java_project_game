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

    @Override
    public void step(Person target) {
        if (this.currentHealth > 0) {

            if (Math.abs(target.getPosition().x - this.position.x) >= Math.abs(target.getPosition().y - this.position.y)) {
                if (target.getPosition().x - this.position.x > 0) {
                    this.position.x++;
                } else {
                    this.position.x--;
                }
            } else {
                if (target.getPosition().y - this.position.y > 0) {
                    this.position.y++;
                } else {
                    this.position.y--;
                }
            }
            System.out.println(this.name + ": Step is done (Infantry)");
        }
    }
}
