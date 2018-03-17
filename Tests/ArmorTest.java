import GameObjects.Components.Armor.Armor;
import GameObjects.Components.Weapons.Weapon;
import GameObjects.IntelligentObjects.Human;
import GameObjects.IntelligentObjects.LivingConstant;
import GameObjects.IntelligentObjects.Marshmallow;
import GameObjects.IntelligentObjects.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmorTest {
    Human human = new Human("Hooooooman");
    Troll troll = new Troll("Trolli-Koll");

    Armor testArmor0 = new Armor() {
        @Override
        public int getDefaultDefense() {
            return 0;
        }

        @Override
        public String getDefaultName() {
            return "TEST ARMOR 0";
        }
    };
    Armor testArmor100 = new Armor() {
        @Override
        public int getDefaultDefense() {
            return 100;
        }

        @Override
        public String getDefaultName() {
            return "TEST ARMOR 100";
        }
    };
    Armor testArmorMinus200 = new Armor() {
        @Override
        public int getDefaultDefense() {
            return -200;
        }

        @Override
        public String getDefaultName() {
            return "TEST ARMOR 300";
        }
    };
    Armor testArmor50 = new Armor() {
        @Override
        public int getDefaultDefense() {
            return 50;
        }

        @Override
        public String getDefaultName() {
            return "TEST ARMOR 50";
        }
    };

    Weapon testWeapon100 = new Weapon() {
        @Override
        public int getDefaultDamage() {
            return 100;
        }

        @Override
        public int getDefaultFrequency() {
            return 0;
        }

        @Override
        public String getDefaultName() {
            return "TEST WEAPON 100";
        }
    };


    @Before
    public void setUp() throws Exception {
        human.addItem(testWeapon100);
        human.equipWeapon(testWeapon100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void EquipWeaponWithoutLoot() throws Exception {
        troll.equipArmor(testArmor100);
        System.out.println("_________________________________");
    }

    @Test
    public void SeeDamageTakenDefault() throws Exception {
        human.attacks(troll);
        assertEquals(LivingConstant.TROLL.getHealth() - 100, troll.currentHP());
        System.out.println("_________________________________");
    }

    @Test
    public void Equip0AndSeeDamageTaken() throws Exception {
        troll.pickUpItem(testArmor0);
        troll.equipArmor(testArmor0);
        human.attacks(troll);
        assertEquals(LivingConstant.TROLL.getHealth()-100, troll.currentHP());
        System.out.println("_________________________________");
    }

    @Test
    public void Equip100AndSeeDamageTaken() throws Exception {
        troll.pickUpItem(testArmor100);
        troll.equipArmor(testArmor100);
        human.attacks(troll);
        assertEquals(LivingConstant.TROLL.getHealth() - 50, troll.currentHP());
        System.out.println("_________________________________");
    }

    @Test
    public void EquipMinus200AndSeeDamageTaken() throws Exception {
        troll.pickUpItem(testArmorMinus200);
        troll.equipArmor(testArmorMinus200);
        human.attacks(troll);
        assertEquals(0, troll.currentHP());
        System.out.println("_________________________________");
    }

}































