package GameObjects.Components;

import GameObjects.IntelligentObjects.LivingBeing;

public class Health{

    private int HP = 0;
    private boolean isAlive = true;
    private LivingBeing entity;
    private int regainRate = 1;

    public Health(LivingBeing entity){
        this.entity = entity;
        this.HP = entity.getDefaultHP();
    }

    public void hit(int damage){
        this.HP -= damage;
        System.out.println(this.entity.toString() + " : <took " + damage + " damage.>");
        if(HP <= 0){
            die();
        }
    }

    public LivingBeing die(){
        this.HP = 0;
        this.isAlive = false;
        System.out.println(this.entity.toString() + " : <died.>");
        return this.entity;
    }

    public LivingBeing resurrect(){
        this.HP = this.entity.getDefaultHP();
        this.isAlive = true;
        System.out.println(this.entity.toString() + " : <resurrected.>");
        return this.entity;
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

    public LivingBeing getEntity() {
        return entity;
    }

    public void setEntity(LivingBeing entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "Health{" +
                "HP=" + HP +
                ", isAlive=" + isAlive +
                ", entity=" + entity.toString() +
                '}';
    }
}
