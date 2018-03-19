package GameObjects.Components.Spells;

import GameObjects.Components.Skills.Skill;

import java.util.ArrayList;

public enum SpellConstant {

    FIREBALL(60, 60, "fireball"),
    ICESPIKE(50, 40, "icespike");

    private final int manaCost;
    private final int damage;
    private final String name;
    //private final int requiredSkillLevel;
    //private final Skill skillClass;

    SpellConstant(int manaCost, int damage, String name) {
        this.manaCost = manaCost;
        this.damage = damage;
        this.name = name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
