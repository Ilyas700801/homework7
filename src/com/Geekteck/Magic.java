package com.Geekteck;

public class Magic  extends Hero{

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(this.getClass().getSimpleName() +  " применил супер способность" + "  " + superAbilityType);
    }
}
