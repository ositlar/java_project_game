package org.example.persons;

import org.example.models.Archer;
import org.example.models.Person;

import java.util.ArrayList;

public class Sniper extends Archer {

    public Sniper(String name, int x, int y) {
        super(name, false, false, true, 100, 100, 1, new int[]{5, 10}, x, y);
        super.maxArrows = super.currentArrows = 10;
        this.team = 1;
    }
}

