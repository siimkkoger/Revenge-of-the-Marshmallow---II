package GameObjects.IntelligentObjects;

import GameObjects.Components.Body;
import GameObjects.Components.Physics;
import GameObjects.Components.View;


public abstract class Entity implements IEntity {

    private Body body;
    private Physics physics;
    private View view;


    // ----------------------------------------- GRAPHIC METHODS ----------------------------------------
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

    // ------------------------------------------ Interface IEntity getters and setters ----------------------------
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


    // ------------------------------------------------ toString and helpers --------------------------------------------


    @Override
    public String toString() {
        return "Entity{" +
                "body=" + body +
                ", physics=" + physics +
                ", view=" + view +
                '}';
    }
}
