package com.pocdecorator;

public class SimpleTroll implements Troll {

    @Override
    public void attack() {
        System.out.println("The troll will try to grab you");
    }

    @Override
    public int getAttackPower() {
        return 20;
    }

    @Override
    public void fleeBattle() {
        System.out.println("Troll runs away.");
    }

}
