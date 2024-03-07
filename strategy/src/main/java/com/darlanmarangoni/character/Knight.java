package com.darlanmarangoni.character;

import com.darlanmarangoni.strategy.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm the knight");
        weaponBehavior.useWeapon();
    }
}
