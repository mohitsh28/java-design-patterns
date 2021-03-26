package com.poc.strategy;

import com.poc.strategy.gof.DragonSlayingStrategy;

public class StrengthStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("You kill the dragon with all your strength.");
    }
}
