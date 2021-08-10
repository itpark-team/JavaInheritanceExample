package com.company.entities;

public class Archer extends Unit {

    private enum AttackType {
        arrow,
        hand
    }

    private final static int ARROW_DAMAGE = 10;
    private final static int HAND_DAMAGE = 5;

    private int countArrows;
    private AttackType attackType;

    public Archer(String name) {
        super(name, ARROW_DAMAGE, 3, 7);

        this.countArrows = 1;
        this.attackType = AttackType.arrow;
    }

    @Override
    public void Attack(Unit unit) throws Exception {

        switch (attackType) {
            case arrow: {
                super.Attack(unit);
                countArrows--;

                if (countArrows == 0) {
                    attackType = AttackType.hand;
                    super.setDamage(HAND_DAMAGE);

                    throw new Exception("arrows are over, hand mode activated");
                }
            }
            break;

            case hand: {
                super.Attack(unit);
            }
            break;
        }
    }

    @Override
    public String getInString() {
        return String.format("%s count arrows: %d", super.getInString(), countArrows);
    }

    public int getCountArrows() {
        return countArrows;
    }
}
