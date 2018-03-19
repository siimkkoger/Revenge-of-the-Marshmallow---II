
import GameObjects.IntelligentObjects.Human;
import GameObjects.IntelligentObjects.Marshmallow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MagicSpellTest {

    Human bob = new Human("Bob");
    Marshmallow tina = new Marshmallow("Tina");

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void DummyTest1() throws Exception {
        System.out.println(bob);
        System.out.println(tina);
        assertNotEquals(bob, tina);
        System.out.println("_________________________________");
    }

    @Test
    public void AttackTest1() throws Exception {
        bob.attacks(tina);
        int tinaHealth = tina.getHealth().getHP();
        assertEquals(40, tinaHealth);
        System.out.println("_________________________________");
    }

    @Test
    public void DeathTest1() throws Exception {
        bob.setAttack(1000000);
        bob.attacks(tina);
        int tinaHealth = tina.getHealth().getHP();
        assertEquals(0, tinaHealth);
        System.out.println("_________________________________");
    }


}
