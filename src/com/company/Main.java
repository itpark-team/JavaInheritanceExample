package com.company;

import com.company.entities.Archer;
import com.company.entities.Unit;
import com.company.entities.Warrior;
import com.company.entities.Wizard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*ArrayList<Unit> units = new ArrayList<>();
        units.add(new Unit("ivan",15,8,8));
        units.add(new Unit("carl",7,15,8));*/

        Unit a1 = new Archer("Ivan Archer");
        Unit w1 = new Warrior("Kolya Warrior");
        Unit wi1 = new Wizard("Vasya Wizard");

        if (a1 instanceof Archer) {
            System.out.println(((Archer) a1).getCountArrows());
        }

        /*System.out.println(a1.getInString());
        System.out.println(w1.getInString());

        System.out.println("=======");

        try {
            a1.Attack(w1);
            a1.Attack(w1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            a1.Attack(w1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println(a1.getInString());
        System.out.println(w1.getInString());*/


    }
}
