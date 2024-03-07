package com.darlanmarangoni;

import com.darlanmarangoni.character.*;
import com.darlanmarangoni.strategy.KnifeBehavior;

public class Main {

    public static void main(String[] args) {
        var knight = new Knight();
        knight.fight();

        var king = new King();
        king.fight();

        var queen = new Queen();
        queen.fight();

        var troll = new Troll();
        troll.fight();
        troll.setWeaponBehavior(new KnifeBehavior());
        troll.fight();

    }
}