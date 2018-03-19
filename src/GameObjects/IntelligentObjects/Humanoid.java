package GameObjects.IntelligentObjects;

import GameObjects.Components.Armor.Armor;
import GameObjects.Components.Lootable;
import GameObjects.Components.Spells.SpellList;
import GameObjects.Components.Weapons.Weapon;

import java.util.ArrayList;

public abstract class Humanoid extends LivingBeing {

    private ArrayList<Weapon> weaponList;
    private ArrayList<Armor> armorList;
    private SpellList spellList;

    private Weapon currentWeapon = null;
    private Armor currentArmor = null;

    private void setUp(){
        this.weaponList = new ArrayList<>();
        this.armorList = new ArrayList<>();
        this.spellList = new SpellList(this);
    }

    public Humanoid(){
        super();
        setUp();
    }

    public Humanoid(String name){
        super(name);
        setUp();
    }

    @Override
    public void attacks(LivingBeing target) {
        int damage;
        if(this.currentWeapon == null){
            damage = this.getAttack();
        }else {
            damage = this.currentWeapon.getDamage();
        }
        System.out.println(this + " : Attacked : => \n" + target + "\n --- ACTION END ---)))!\n");
        target.isHit(damage);
    }

    @Override
    public void isHit(int damage) {
        /*
        Half life formula : A = A0 * (1/2)**(t/h)
         */
        int damageTaken;
        if(this.currentArmor == null){
            damageTaken = damage;
        }else{
            int armor = this.currentArmor.getDefense();
            damageTaken = (int) (damage * Math.pow(0.5, (armor/Armor.HALF_LIFE())));
        }
        this.getHealth().hit(damageTaken);
    }

    // ------------------------------------ ITEMS ---------------------------------------

    public void addItem(Lootable item){
        // TODO : add support for more items!
        item.setOwner(this);
        if(item instanceof Weapon){
            this.weaponList.add((Weapon) item);
        }
        if(item instanceof Armor){
            this.armorList.add((Armor) item);
        }
        System.out.println(this + " : Added : => " + item + "\n --- ACTION END ---)))!\n");
    }

    public void removeItem(Lootable item){
        if(item instanceof Weapon){
            this.weaponList.remove((Weapon) item);
        }
        if(item instanceof Armor){
            this.armorList.remove((Armor) item);
        }
        System.out.println(this + " : Removed : => " + item + "\n --- ACTION END ---)))!\n");
    }

    public void pickUpItem(Lootable item){
        item.pickUp(this);
        if(item instanceof Weapon){
            this.weaponList.add((Weapon) item);
        }
        if(item instanceof Armor){
            this.armorList.add((Armor) item);
        }
        System.out.println(this + " : Looted : => \n" + item + "\n --- ACTION END ---)))!\n");
    }

    public void equipWeapon(Weapon weapon){
        /*
        TODO : if carryweight too big then don't take it.
         */
        if(!this.weaponList.contains(weapon)){
            throw new IllegalArgumentException("You have to loot the weapon before equiping it!");
        }
        if(this.currentWeapon != null){
            this.currentWeapon.unEquip();
        }
        weapon.equip();
    }

    public void equipArmor(Armor armor){
        /*
        TODO : if carryweight too big then don't take it.
         */
        if(!this.armorList.contains(armor)){
            throw new IllegalArgumentException("You have to loot the armor before equiping it!");
        }
        if(this.currentArmor != null){
            this.currentArmor.unEquip();
        }
        armor.equip();
    }

    public void unequipWeapon(){
        if(this.currentWeapon != null) this.currentWeapon.unEquip();;
    }

    public void unequipArmor(){
        if(this.currentArmor != null) this.currentArmor.unEquip();
    }




    // ---------------------------------- GETTERS / SETTERS ----------------------------------------------------

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon weapon) {
        this.currentWeapon = weapon;
    }

    public Armor getCurrentArmor() {
        return currentArmor;
    }

    public void setCurrentArmor(Armor armor) {
        this.currentArmor = armor;
    }
}
