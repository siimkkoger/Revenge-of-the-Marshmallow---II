package GameObjects.Components;

import GameObjects.IntelligentObjects.LivingBeing;

public class Health{

    private int HP = 0;
    private boolean isAlive = true;
    private LivingBeing owner;
    private int regainRate = 1;

    public Health(LivingBeing owner){
        this.owner = owner;
        this.HP = owner.getDefaultHP();
    }

    public void hit(int damage){
        this.HP -= damage;
        System.out.println(this.owner.toString() + " : <took " + damage + " damage.>");
        if(HP <= 0){
            die();
        }
    }

    public LivingBeing die(){
        this.HP = 0;
        this.isAlive = false;
        System.out.println(this.owner.toString() + " : <died.>");
        return this.owner;
    }

    public LivingBeing resurrect(){
        this.HP = this.owner.getDefaultHP();
        this.isAlive = true;
        System.out.println(this.owner.toString() + " : <resurrected.>");
        return this.owner;
    }


    // --------------------------- GETTERS and SETTERS -------------------------------

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public LivingBeing getOwner() {
        return owner;
    }

    public void setOwner(LivingBeing owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Health{" +
                "HP=" + HP +
                ", isAlive=" + isAlive +
                ", owner=" + owner.toString() +
                '}';
    }
}
