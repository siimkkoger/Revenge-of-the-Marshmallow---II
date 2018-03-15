package Engine;

import java.util.ArrayList;

public interface IEntity {
    /*
    TODO : sort out what is needed and what is not.
     */

    // Actions
    public void destroy();
    public void update();
    public void render();

    // Components
    //public Engine.Body getBody();
    //public Engine.Body setBody(Engine.Body body);
    public Physics getPhysics();
    public Physics setPhysics(Physics physics);
    public Health getHealth();
    public Health setHealth(Health health);
    public Weapon getWeapon();
    public Weapon setWeapon(Weapon weapon);
    //public Engine.View getView();
    //public Engine.View setView(Engine.View view);

    // Signals
    public void entityCreated();
    public Entity entityDestroyed();

    // Dependencies
    public ArrayList<Entity> getTargets();
    public void setTargets(ArrayList<Entity> targets);
    public void addTarget(Entity target);
    public ArrayList<Entity> getGroup();
    public void setGroup(ArrayList<Entity> group);
}
