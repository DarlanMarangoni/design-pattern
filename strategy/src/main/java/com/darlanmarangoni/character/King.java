package com.darlanmarangoni.character;

import com.darlanmarangoni.strategy.KnifeBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm the King");
        weaponBehavior.useWeapon();
    }
}
