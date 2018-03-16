package GameObjects.Components.Skills;

import GameObjects.IntelligentObjects.Entity;
import GameObjects.IntelligentObjects.LivingBeing;

import java.util.ArrayList;

public class Skill {

    /*
    Skills are divided to One-time-use and Burning
     */

    private LivingBeing entity;
    private Entity target;
    private int manaCost;
    private int damage;
    private ArrayList<Skill> requiredSkills;
    private ArrayList<Skill> nextSkills;
    /*
    After first round is tested:
    private int level
    private int userLevel
    private int
     */
}
