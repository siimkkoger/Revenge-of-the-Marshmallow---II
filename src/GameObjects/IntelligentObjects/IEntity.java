package GameObjects.IntelligentObjects;

import GameObjects.Components.Entity;
import GameObjects.Components.Physics;

public interface IEntity {
    /*
    TODO : sort out what is needed and what is not.
     */

    // Actions
    public void destroy();
    public void update();
    public void render();

    // GameObjects.Components
    public GameObjects.Components.Body getBody();
    public GameObjects.Components.Body setBody(GameObjects.Components.Body body);
    public Physics getPhysics();
    public Physics setPhysics(Physics physics);
    public GameObjects.Components.View getView();
    public GameObjects.Components.View setView(GameObjects.Components.View view);

    // Signals
    public void entityCreated();
    public Entity entityDestroyed();
}
