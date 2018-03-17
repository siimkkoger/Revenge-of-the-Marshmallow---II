package GameObjects.Components.Weapons;

import GameObjects.Components.Equipable;
import GameObjects.Components.Lootable;
import GameObjects.IntelligentObjects.Entity;
import GameObjects.IntelligentObjects.LivingBeing;

public abstract class Weapon implements Lootable, Equipable{

    public abstract int getDefaultDamage();
    public abstract int getDefaultFrequency();
    public abstract String getDefaultName();

    private LivingBeing owner;
    private int damage;
    private int frequency;
    private String name;
    private boolean isEquiped;

    public Weapon(LivingBeing owner){
        this.owner = owner;
        owner.addItem(this);
        this.setDamage(getDefaultDamage());
        this.setFrequency(getDefaultFrequency());
        this.setName(getDefaultName());
    }

    public Weapon(){
        this.owner = null;
        this.setDamage(getDefaultDamage());
        this.setFrequency(getDefaultFrequency());
        this.setName(getDefaultName());
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
        TODO : send information about the item.
         */
        System.out.println("Looking at the item: " + this);
    }

    @Override
    public void equip() {
        this.owner.setCurrentWeapon(this);
        isEquiped = true;
    }

    @Override
    public void unEquip() {
        this.owner.setCurrentWeapon(null);
        isEquiped = false;
    }

    @Override
    public boolean isEquiped() {
        return this.isEquiped;
    }


    // ------------------------------------------------ GETTERS and SETTERS --------------------------------------


    @Override
    public LivingBeing getOwner() {
        return this.owner;
    }

    @Override
    public void setOwner(LivingBeing newOwner) {
        this.owner = newOwner;
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
        return "\nWeapon{" +
                "\n    name=" + name +
                ", \n    damage=" + damage +
                ", \n    owner='" + owner.getName() + '\'' +
                '}';
    }


}
