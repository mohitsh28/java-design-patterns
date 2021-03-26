/*
The LambdaStrategy pattern (also known as the policy pattern) is a software design pattern that
enables an algorithm's behavior to be selected at runtime.
Before Java 8 the Strategies needed to be separate classes forcing the developer
to write lots of boilerplate code. With modern Java it is easy to pass behavior
with method references and lambdas making the code shorter and more readable.
 */

import com.poc.strategy.CrossBowStrategy;
import com.poc.strategy.SpellStrategy;
import com.poc.strategy.StrengthStrategy;
import com.poc.strategy.gof.DragonSlayer;

public class AppRunner {

    public static void main(String[] args) {
        System.out.println("Green dragon spotted ahead!");
        var dragonSlayer = new DragonSlayer(new CrossBowStrategy());
        dragonSlayer.goToBattle();
        System.out.println("Red dragon emerges.");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();
        System.out.println("Black dragon lands before you.");
        dragonSlayer.changeStrategy(new StrengthStrategy());
        dragonSlayer.goToBattle();
    }
}
