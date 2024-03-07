package com.darlanmarangoni.character;

import com.darlanmarangoni.strategy.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm the Troll");
        weaponBehavior.useWeapon();
    }
}
