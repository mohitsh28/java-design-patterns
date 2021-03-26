package com.poc.strategy.gof;

//Different Strategies
public class DragonSlayer {

    private DragonSlayingStrategy dragonSlayingStrategy;

    public DragonSlayer(DragonSlayingStrategy dragonSlayingStrategy) {
        this.dragonSlayingStrategy = dragonSlayingStrategy;
    }

    public void changeStrategy(DragonSlayingStrategy dragonSlayingStrategy) {
        this.dragonSlayingStrategy = dragonSlayingStrategy;
    }

    public void goToBattle() {
        dragonSlayingStrategy.execute();
    }


}
