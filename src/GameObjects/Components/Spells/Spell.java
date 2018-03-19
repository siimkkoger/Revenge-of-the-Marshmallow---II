package GameObjects.Components.Spells;

import GameObjects.Components.Skills.Skill;
import GameObjects.IntelligentObjects.LivingBeing;

import java.util.ArrayList;

public abstract class Spell {
    /*
    Spells are divided to One-time-use and Burning
     */
    public abstract int getDefaultDamage();
    public abstract int getDefaultManaCost();
    public abstract String getDefaultName();

    private String name;
    private LivingBeing target;
    private int manaCost;
    private int damage;
    /*
    TODO : add requried skill level (destruction, healing, etc...)
    TODO : only allow to learn it, if LivingBeing.level >= spell.requiredSkillLevel
     */

    public Spell(){
        this.setName(getDefaultName());
        this.setManaCost(getDefaultManaCost());
        this.setDamage(getDefaultDamage());
    }

    public void changeDamage(int percent){
        /*
        TODO : stack up damage changes
         */
        damage = getDefaultDamage();
        damage = damage * (percent/100);
    }

    public void changeManaCost(int percent){
        /*
        TODO : stack up manaCost changes
         */
        manaCost = getDefaultManaCost();
        manaCost = manaCost * (percent/100);
    }

    // --------------------------- GETTERS / SETTERS --------------------------------


    public LivingBeing getTarget() {
        return target;
    }

    public void setTarget(LivingBeing target) {
        this.target = target;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}
