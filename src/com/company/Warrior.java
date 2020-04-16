package com.company;

public class Warrior extends Hero {
    public void applySuoerAbility (String superAbilityType){
    }
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Warrior применил суперспособность "+superAbilityType);
    }
}
