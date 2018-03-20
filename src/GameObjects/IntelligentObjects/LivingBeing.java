package GameObjects.IntelligentObjects;
import GameObjects.Components.*;
import GameObjects.Components.Armor.Armor;
import GameObjects.Components.Spells.Spell;
import GameObjects.Components.Spells.SpellList;
import GameObjects.Components.Weapons.Weapon;

import java.util.ArrayList;

public abstract class LivingBeing extends Entity{

    public abstract int getDefaultHP();
    public abstract int getDefaultMP();
    public abstract int getDefaultAttack();
    public abstract int getDefaultDefense();
    public abstract String getDefaultName();

    private int attack;
    private int defense;

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

    public boolean isAlive(){
        return this.getHealth().isAlive();
    }

    public int currentHP(){
        return this.getHealth().getHP();
    }

    // ------------------------------------ ACTION ---------------------------
    public abstract void attacks(LivingBeing target);
    public abstract void isHit(int damage);


    // ------------------------------------ GETTERS and SETTERS ---------------------------

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



    @Override
    public String toString() {
        return "LivingBeing{" +
                "name='" + this.getName() + '\'' +
                ", health=" + this.getHealth().getHP() +
                ", magic=" + this.getMagic().getMP() +
                '}';
    }
}
