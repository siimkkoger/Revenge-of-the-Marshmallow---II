package GameObjects.Components.Armor;

import GameObjects.Components.Equipable;
import GameObjects.Components.Lootable;
import GameObjects.IntelligentObjects.Humanoid;
import GameObjects.IntelligentObjects.LivingBeing;

public abstract class Armor implements Lootable, Equipable{

    /*
    A = A0 * [(1/2) ** (t/T)]

    Armor current function:
        -- In case of 100 dmg --
        Armor DamageTaken
        -200 400
        -100 200
        -50  100*sqrt(2)
        0    100
        100  50
        200  25
        300  12.5
        400  6.25
        500  3.125

        Can use half life formula !!! Studyng physics for a semester finally payed off !!!
     */

    private static final int HALF_LIFE = 100;

    public abstract int getDefaultDefense();
    public abstract String getDefaultName();

    private Humanoid owner;
    private boolean isEquiped;
    private int defense;
    private String name;

    private void setUp(){
        this.setDefense(getDefaultDefense());
        this.setName(getDefaultName());
    }

    public Armor(Humanoid owner){
        this.owner = owner;
        owner.addItem(this);
        setUp();
    }

    public Armor(){
        this.owner = null;
        setUp();
    }

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

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int HALF_LIFE() {
        return HALF_LIFE;
    }

    @Override
    public String toString() {
        return "\nArmor{" +
                "\n    defense=" + defense +
                "\n    , name='" + name + '\'' +
                '}';
    }
}
