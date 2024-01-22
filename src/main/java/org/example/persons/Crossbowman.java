package org.example.persons;

import org.example.models.Archer;
import org.example.models.Person;

public class Crossbowman extends Archer {
    public Crossbowman(String name, int x, int y) {
        super(name, false, false, true, 110, 110, 1, new int[]{6, 9}, x, y);
        super.maxArrows = super.currentArrows = 10;
        this.team = 0;
    }
}
