package com.company;

public class Medic extends Hero {
    public void applySuoerAbility (String superAbilityType){
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Medic применил суперспособность "+superAbilityType);
    }
}
