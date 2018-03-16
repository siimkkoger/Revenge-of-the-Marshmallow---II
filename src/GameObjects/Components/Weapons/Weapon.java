package GameObjects.Components.Weapons;

import GameObjects.Components.Equipable;
import GameObjects.Components.Lootable;
import GameObjects.IntelligentObjects.Entity;
import GameObjects.IntelligentObjects.LivingBeing;

public abstract class Weapon implements Lootable, Equipable{

    public abstract int getDefaultDamage();
    public abstract int getDefaultFrequency();
    public abstract String getDefautlName();

    private LivingBeing owner;
    private int damage;
    private int frequency;
    private String name;
    private boolean isEquiped;

    public Weapon(LivingBeing owner){
        this.owner = owner;
        this.setDamage(getDefaultDamage());
        this.setFrequency(getDefaultFrequency());
        this.setName(getDefautlName());
    }

    public Weapon(){
        this.owner = null;
        this.setDamage(getDefaultDamage());
        this.setFrequency(getDefaultFrequency());
        this.setName(getDefautlName());
    }

    @Override
    public void pickUp(LivingBeing looter) {
        /*
        TODO : somehow render it away when it's picked up. (When owner != null ?)
         */
        this.owner = looter;
    }

    @Override
    public void lookInfo() {
        /*
        TODO : send information about the item on the ground.
         */
        System.out.println("Looking at the item: " + this);
    }

    @Override
    public void equip() {
        this.owner.setCurrentWeapon(this);
        owner.setAttack(this.damage);
        isEquiped = true;
    }

    @Override
    public void unEquip() {
        this.owner.setCurrentWeapon(null);
        owner.setAttack(owner.getDefaultAttack());
        isEquiped = false;
    }

    @Override
    public boolean isEquiped() {
        return this.isEquiped;
    }


    // ------------------------------------------------ GETTERS and SETTERS --------------------------------------
    public Entity getOwner() {
        return owner;
    }

    public void setOwner(LivingBeing owner) {
        this.owner = owner;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name=" + name +
                ", damage=" + damage +
                ", owner='" + owner.getName() + '\'' +
                '}';
    }


}
