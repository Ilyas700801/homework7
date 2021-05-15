package com.Geekteck;

public class Medic extends Hero{

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(this.getClass().getSimpleName() +  " применил супер способность" + "  " + superAbilityType);
    }
}
