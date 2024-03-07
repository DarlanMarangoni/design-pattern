package com.darlanmarangoni.strategy;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("using axe");
    }
}
