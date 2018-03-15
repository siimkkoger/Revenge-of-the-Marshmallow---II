package Engine;

import java.util.ArrayList;


public abstract class Entity implements IEntity {

    // TODO : when graphics => {private Body body;}
    private Physics physics;
    private Health health;
    private Weapon weapon;
    // TODO : when graphics => {private View view;}
    private ArrayList<Entity> targets;
    private ArrayList<Entity> group;


    @Override
    public void destroy() {
        /*
        TODO : It's going to be implemented if groups are needed.
         */
    }

    @Override
    public void update() {
        /*
        TODO : It's going to be implemented when the graphics are added.
         */
    }

    @Override
    public void render() {
        /*
        TODO : It's going to be implemented when the graphics are added.
         */
    }

    @Override
    public Physics getPhysics() {
        return this.physics;
    }

    @Override
    public Physics setPhysics(Physics physics) {
        this.physics = physics;
        return physics;
    }

    @Override
    public Health getHealth() {
        return this.health;
    }

    @Override
    public Health setHealth(Health health) {
        this.health = health;
        return health;
    }

    @Override
    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public Weapon setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return weapon;
    }

    @Override
    public void entityCreated() {
        System.out.println("A new entity " + this.toString() + " was created!");
    }

    @Override
    public Entity entityDestroyed() {
        System.out.println("A entity " + this.toString() + " was destroyed!");
        return this;
    }

    @Override
    public ArrayList<Entity> getTargets() {
        return this.targets;
    }

    @Override
    public void setTargets(ArrayList<Entity> targets) {
        this.targets = targets;
    }

    @Override
    public void addTarget(Entity target) {
        this.targets.add(target);
    }

    @Override
    public ArrayList<Entity> getGroup() {
        return this.group;
    }

    @Override
    public void setGroup(ArrayList<Entity> group) {
        this.group = group;
    }
}
