package GameObjects.IntelligentObjects;
import GameObjects.Components.*;
import GameObjects.Components.Armor.Armor;
import GameObjects.Components.Clothes.Cloth;
import GameObjects.Components.Skills.Skill;
import GameObjects.Components.Weapons.Sword;
import GameObjects.Components.Weapons.Weapon;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class LivingBeing extends Entity{

    public abstract int getDefaultHP();
    public abstract int getDefaultMP();
    public abstract int getDefaultAttack();
    public abstract int getDefaultDefense();
    public abstract String getDefaultName();

    private String name;
    private Health health;
    private Magic magic;
    private int attack;
    private int defense;

    private Weapon currentWeapon = null;
    private Armor currentArmor = null;

    private ArrayList<Weapon> weaponList = new ArrayList<>();
    private ArrayList<Armor> armorList = new ArrayList<>();
    private ArrayList<Skill> skillList = new ArrayList<>();

    private void setBasics(){
        this.setName(getDefaultName());
        this.setHealth(new Health(this));
        this.setMagic(new Magic(this));
        this.setAttack(getDefaultAttack());
        this.setDefense(getDefaultDefense());
        /*
        TODO :  When combining graphics:
        TODO :      1) setBody
        TODO :      2) setPhysics
        TODO :      3) setView
         */
    }

    public LivingBeing(){
        setBasics();
    }

    public LivingBeing(String name){
        setBasics();
        this.setName(name);
    }


    // ------------------------------------- STATE CHECKERS ------------------
    public boolean isAlive(){
        return this.health.isAlive();
        /*
        TODO : somehow remove a view.
         */
    }

    public int currentHP(){
        return health.getHP();
    }

    // ------------------------------------ ACTION ---------------------------
    public void attacks(LivingBeing target){
        int damage;
        if(this.currentWeapon == null){
            damage = this.attack;
        }else {
            damage = this.currentWeapon.getDamage();
        }
        System.out.println(this + " : Attacked : => \n" + target + "\n --- ACTION END ---)))!\n");
        target.isHit(damage);
    }

    private void isHit(int damage){
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
        this.health.hit(damageTaken);
    }

    public void useSkill(Skill skill){

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

    // ------------------------------------ GETTERS and SETTERS ---------------------------


    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Magic getMagic() {
        return magic;
    }

    public void setMagic(Magic magic) {
        this.magic = magic;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

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

    @Override
    public String toString() {
        return "LivingBeing{" +
                "name='" + name + '\'' +
                ", health=" + health.getHP() +
                ", magic=" + magic.getMP() +
                ", currentWeapon=" + currentWeapon +
                ", currentArmor=" + currentArmor +
                '}';
    }
}
