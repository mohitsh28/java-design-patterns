import com.poc.builder.model.SuperHero;
import com.poc.builder.model.attributes.Armor;
import com.poc.builder.model.attributes.HairColor;
import com.poc.builder.model.attributes.Profession;
import com.poc.builder.model.attributes.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {

    @Test
    void testBuilderHero() {
        var heroName = "Lance";

        final var hero = new SuperHero.Builder(Profession.ENGINEER,heroName)
                .withArmorType(Armor.LEATHER)
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.SWORD)
                .build();

        assertNotNull(hero);
        assertNotNull(hero.toString());
        assertEquals(Profession.ENGINEER,hero.getProfession());
        assertEquals(HairColor.BLACK,hero.getHairColor());
    }

    @Test
    void testMissingName() {
        assertThrows(IllegalArgumentException.class,() -> new SuperHero.Builder(Profession.PROFESSOR,null));
    }
}
