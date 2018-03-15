package Components;

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
    public Components.Body getBody();
    public Components.Body setBody(Components.Body body);
    public Physics getPhysics();
    public Physics setPhysics(Physics physics);
    public Health getHealth();
    public Health setHealth(Health health);
    public Weapon getWeapon();
    public Weapon setWeapon(Weapon weapon);
    public Components.View getView();
    public Components.View setView(Components.View view);

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
