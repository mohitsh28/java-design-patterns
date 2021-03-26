import com.pocdecorator.ClubbedTroll;
import com.pocdecorator.SimpleTroll;

/*
The Decorator pattern is a more flexible alternative to subclassing. The Decorator class
implements the same interface as the target and uses composition to "decorate" calls to the
target. Using the Decorator pattern it is possible to change the behavior of the class during
runtime.
 */

public class AppRunner {
    public static void main(String[] args) {

        System.out.println("A simple looking troll approaches.");
        var troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("Simple troll power " + troll.getAttackPower());

        System.out.println("A troll with huge club surprises you.");
        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println("Clubbed troll power " + clubbedTroll.getAttackPower());
    }

}
