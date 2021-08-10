package com.company.entities;

public class Unit {
    private String name;
    private int damage;
    private int defence;
    private int hp;

    public Unit(String name, int damage, int defence, int hp) {
        this.name = name;
        this.damage = damage;
        this.defence = defence;
        this.hp = hp;
    }

    public void Attack(Unit unit) throws Exception {
        int attackForce = damage - unit.defence;

        if (attackForce < 0) {
            attackForce = 0;
        }
        unit.hp = unit.hp - attackForce;
    }

    public String getInString() {
        return String.format("name: %s, damage: %d, defence: %d, hp: %d", name, damage, defence, hp);
    }

    protected void setDamage(int damage) {
        this.damage = damage;
    }
}
