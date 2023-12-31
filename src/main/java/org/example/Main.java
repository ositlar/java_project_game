package org.example;

import org.example.models.Person;
import org.example.persons.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Person> gamePersons = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int pers = rnd.nextInt(0, 4);
            switch (pers) {
                case 0:
                    gamePersons.add(new Sniper(getName(), 0, i));
                    break;
                case 1:
                    gamePersons.add(new Sorcerer(getName(), 0, i));
                    break;
                case 2:
                    gamePersons.add(new Villager(getName(), 0, i, (byte)1));
                    break;
                case 3:
                    gamePersons.add(new Spearman(getName(), 0, i));
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            int pers = rnd.nextInt(0, 4);
            switch (pers) {
                case 0:
                    gamePersons.add(new Archer(getName(), 9, i));
                    break;
                case 1:
                    gamePersons.add(new Monk(getName(), 9, i));
                    break;
                case 2:
                    gamePersons.add(new Robber(getName(), 9, i));
                    break;
                case 3:
                    gamePersons.add(new Villager(getName(), 9, i, (byte)0));
                    break;
            }
        }
        gamePersons.forEach(System.out::println);
    }

    static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length - 1)].toString();
    }
}

