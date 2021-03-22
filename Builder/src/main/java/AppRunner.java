/*
Anti-Pattern -> Telescoping Constructor:Increase of object parameters which leads to exponential list of constructors.
Solution to this is Builder Design Pattern.
Instead of using numerous constructors, builder uses another object. A builder that receives each initialization parameter
step by step and returns the constructed object at once.
 */

import com.poc.builder.model.SuperHero;
import com.poc.builder.model.attributes.*;

public class AppRunner {

    public static void main(String[] args) {

        var doctoHero = new SuperHero.Builder(Profession.DOCTOR,"Maze")
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.SWORD)
                .build();

        System.out.println(doctoHero.toString());

        var warrior = new SuperHero.Builder(Profession.ENGINEER,"Jack")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_CURLY).withArmorType(Armor.LEATHER).withWeapon(Weapon.SWORD)
                .build();
        System.out.println(warrior.toString());
    }
}
