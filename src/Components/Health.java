package Components;

public class Health{

    private final int DEFAULT_HP;

    private int HP = 0;
    private boolean isAlive = true;
    private Entity entity = null;

    public Health(Entity entity, int HP){
        this.entity = entity;
        this.DEFAULT_HP = HP;
        this.HP = HP;
    }

    public void hit(int damage){
        this.HP -= damage;
        System.out.println(this.entity.toString() + ": took " + damage + " damage.");
        if(HP <= 0){
            die();
        }
    }

    public Entity die(){
        this.HP = 0;
        this.isAlive = false;
        return this.entity;
    }

    public Entity resurrect(){
        this.HP = this.DEFAULT_HP;
        this.isAlive = true;
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

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
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
