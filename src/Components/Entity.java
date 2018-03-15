package Components;

import java.util.ArrayList;


public abstract class Entity implements IEntity {

    private Body body;
    private Physics physics;
    private Health health;
    private Weapon weapon;
    private View view;
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
    public Body getBody() {
        return this.body;
    }

    @Override
    public Body setBody(Body body) {
        this.body = body;
        return this.body;
    }

    @Override
    public Physics getPhysics() {
        return this.physics;
    }

    @Override
    public Physics setPhysics(Physics physics) {
        this.physics = physics;
        return this.physics;
    }

    @Override
    public Health getHealth() {
        return this.health;
    }

    @Override
    public Health setHealth(Health health) {
        this.health = health;
        return this.health;
    }

    @Override
    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public Weapon setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this.weapon;
    }

    @Override
    public View getView() {
        return this.view;
    }

    @Override
    public View setView(View view) {
        this.view = view;
        return this.view;
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
