package com.darlanmarangoni.strategy;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("using knife");
    }
}
