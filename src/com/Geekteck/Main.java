package com.Geekteck;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        Magic magic = new Magic();
        Hero[] heroes = new Hero[]{medic, warrior, magic};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("CRITICAL DAMAGE");
        }
    }
}
