import GameObjects.Components.Weapons.Weapon;
import GameObjects.IntelligentObjects.Human;
import GameObjects.IntelligentObjects.LivingConstant;
import GameObjects.IntelligentObjects.Marshmallow;
import GameObjects.IntelligentObjects.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {

    Human human = new Human("Hooooooman");
    Marshmallow marshmallow = new Marshmallow("Vahukommike");
    Troll troll = new Troll("Trolli-Koll");

    Weapon testWeapon0 = new Weapon() {
        @Override
        public int getDefaultDamage() {
            return 0;
        }

        @Override
        public int getDefaultFrequency() {
            return 0;
        }

        @Override
        public String getDefaultName() {
            return "A Test Weapon 0";
        }
    };
    Weapon testWeapon10 = new Weapon() {
        @Override
        public int getDefaultDamage() {
            return 10;
        }

        @Override
        public int getDefaultFrequency() {
            return 0;
        }

        @Override
        public String getDefaultName() {
            return "A Test Weapon 10";
        }
    };
    Weapon testWeapon1000 = new Weapon() {
        @Override
        public int getDefaultDamage() {
            return 1000;
        }

        @Override
        public int getDefaultFrequency() {
            return 0;
        }

        @Override
        public String getDefaultName() {
            return "A Test Weapon 1000";
        }
    };

    @Before
    public void setUp() throws Exception {

    }

    @Test(expected = IllegalArgumentException.class)
    public void EquipWeaponWithoutLoot() throws Exception {
        human.equipWeapon(testWeapon0);
        System.out.println("_________________________________");
    }

    @Test
    public void EquipButLivindDamageWillNotChange0() throws Exception {
        human.pickUpItem(testWeapon0);
        human.equipWeapon(testWeapon0);
        int humanDamage = human.getAttack();
        assertEquals(10, humanDamage);
        System.out.println("_________________________________");
    }

    @Test
    public void EquipAndSeeWeaponDamage0() throws Exception {
        human.pickUpItem(testWeapon0);
        human.equipWeapon(testWeapon0);
        int humanOutput = human.getCurrentWeapon().getDamage();
        assertEquals(0, humanOutput);
        System.out.println("_________________________________");
    }

    @Test
    public void EquipAndCompareDamage1000() throws Exception {
        human.pickUpItem(testWeapon1000);
        human.equipWeapon(testWeapon1000);
        int humanOutput = human.getCurrentWeapon().getDamage();
        assertEquals(1000, humanOutput);
        System.out.println("_________________________________");
    }

    @Test
    public void UnequipBareHanded() throws Exception {
        human.unequipWeapon();
        int humanDamage = human.getAttack();
        assertEquals(LivingConstant.HUMAN.getAttack(), humanDamage);
        System.out.println("_________________________________");
    }

    @Test
    public void EquipUnequip1000() throws Exception {
        human.pickUpItem(testWeapon1000);
        human.equipWeapon(testWeapon1000);
        human.unequipWeapon();
        int humanDamage = human.getAttack();
        assertEquals(LivingConstant.HUMAN.getAttack(), humanDamage);
        System.out.println("_________________________________");
    }

    @Test
    public void AttackWith0() throws Exception {
        human.pickUpItem(testWeapon0);
        human.equipWeapon(testWeapon0);
        human.attacks(troll);
        int trollLife = troll.currentHP();
        assertEquals(LivingConstant.TROLL.getHealth(), trollLife);
        System.out.println("_________________________________");
    }

    @Test
    public void AttackWith1000() throws Exception {
        human.pickUpItem(testWeapon1000);
        human.equipWeapon(testWeapon1000);
        human.attacks(troll);
        int trollLife = troll.currentHP();
        assertEquals(0, trollLife);
        System.out.println("_________________________________");
    }


}




















