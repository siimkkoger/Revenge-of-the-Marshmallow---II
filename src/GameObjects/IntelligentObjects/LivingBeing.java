package GameObjects.IntelligentObjects;
import GameObjects.Components.*;
import java.util.ArrayList;

public abstract class LivingBeing extends Entity{

    public abstract int getDefaultHP();
    public abstract int getDefaultMP();
    public abstract int getDefaultAttack();
    public abstract int getDefaultDefense();

    private String name;
    private Health health;
    private Magic magic;
    private int attack;
    private int defense;
    /*
    TODO : After first test:
            1) accuracy
            2) moveSpeed
            3)
     */
    private Weapon currentWeapon = null;
    private ArrayList<Weapon> weaponList = new ArrayList<>();
    private ArrayList<Skill> skillList = new ArrayList<>();

    // ------------------------------------- STATE CHECKERS ------------------

    public boolean isAlive(){
        if(this.getHealth().isAlive()){
            return true;
        }
        return false;
        /*
        TODO : somehow remove a view.
         */
    }

    public void attacks(LivingBeing target){
        int damage = 0;
        /*
        TODO : damage is calculated based on attack, weapons, precision etc..
         */
        target.isHit(damage);
    }

    public void isHit(int damage){
        int calculatedDamage = damage;
        /*
            TODO : calculate damage taken considering defense, spells, perks etc...
         */
        this.health.hit(calculatedDamage);
    }

    // -------------------------------------- ACTION ------------------------

    public void useSkill(Skill skill){

    }

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
}
