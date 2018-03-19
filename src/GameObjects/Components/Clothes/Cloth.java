package GameObjects.Components.Clothes;

import GameObjects.Components.Lootable;
import GameObjects.IntelligentObjects.Humanoid;
import GameObjects.IntelligentObjects.LivingBeing;

public class Cloth implements Lootable{

    private Humanoid owner;

    @Override
    public void pickUp(Humanoid looter) {
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
    public Humanoid getOwner() {
        return this.owner;
    }

    @Override
    public void setOwner(Humanoid newOwner) {
        this.owner = newOwner;
    }
}
