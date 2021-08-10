package com.company.entities;

public class Warrior extends Unit {

    public Warrior(String name) {
        super(name, 15, 6, 10);
    }

    public int getCountArrows() {
        return 0;
    }
}
