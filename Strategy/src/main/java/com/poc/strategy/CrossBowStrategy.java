package com.poc.strategy;

import com.poc.strategy.gof.DragonSlayingStrategy;

public class CrossBowStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("Keep shooting the Dragon with Flame Arrows.");
    }
}
