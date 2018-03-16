package GameObjects.Components;

import GameObjects.IntelligentObjects.Entity;

public class Body {

    private Entity entity = null;
    /*
            x and y should be the middle parts of the Squares
     */
    private int x, y, lengthX, lengthY;


    public Body(Entity entity){
        this.entity = entity;
    }

    public Body(Entity entity, int x, int y){
        this.entity = entity;
        this.x = x;
        this.y = y;
    }

    public boolean testCollision(Entity otherEntity){
        /*
             !!! x an y are supposed to be the middle parts of the squares according to those calculations !!!
         */
        boolean isColliding = false;
        int dx = 0;
        int dy = 0;
        int distanceBetweenX = this.lengthX/2 + otherEntity.getBody().getLengthX()/2;
        int distanceBetweenY = this.lengthY/2 + otherEntity.getBody().getLengthY()/2;

        dx = this.x - otherEntity.getBody().getX();
        dy = this.y - otherEntity.getBody().getY();

        if (Math.abs(dx) < distanceBetweenX && Math.abs(dy) < distanceBetweenY) {
            isColliding = true;
            System.out.println(this.entity.toString() + " is colliding with " + otherEntity.toString());
        }
        return isColliding;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLengthX() {
        return lengthX;
    }

    public void setLengthX(int lengthX) {
        this.lengthX = lengthX;
    }

    public int getLengthY() {
        return lengthY;
    }

    public void setLengthY(int lengthY) {
        this.lengthY = lengthY;
    }
}
