package com.poc.strategy;

import com.poc.strategy.gof.DragonSlayingStrategy;

public class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("Cast the spell to slow down the Dragon.");
    }
}
