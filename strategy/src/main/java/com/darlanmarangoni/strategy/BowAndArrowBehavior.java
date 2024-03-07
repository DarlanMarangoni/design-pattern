package com.darlanmarangoni.strategy;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("using bow and arrow");
    }
}
