package GameObjects.Components.Armor;

import GameObjects.Components.Equipable;
import GameObjects.Components.Lootable;
import GameObjects.IntelligentObjects.LivingBeing;

public class Armor implements Lootable, Equipable{

    private LivingBeing owner;
    private boolean isEquiped;

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
        this.owner.setCurrentArmor(this);
        isEquiped = true;
    }

    @Override
    public void unEquip() {
        this.owner.setCurrentArmor(null);
        isEquiped = false;
    }

    @Override
    public boolean isEquiped() {
        return this.isEquiped;
    }
}
