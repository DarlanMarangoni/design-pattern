package com.darlanmarangoni.character;

import com.darlanmarangoni.strategy.BowAndArrowBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm the Queen");
        weaponBehavior.useWeapon();
    }
}
