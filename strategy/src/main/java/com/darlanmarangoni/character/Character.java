package com.darlanmarangoni.character;

import com.darlanmarangoni.strategy.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
