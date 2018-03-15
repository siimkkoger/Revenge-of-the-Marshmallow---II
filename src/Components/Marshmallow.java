package Components;

public class Marshmallow extends Entity {
    /*
            This is the player class - yes... player is a marshmallow
            AND IT WANTS REVENGE!!!!!!
     */

    public Marshmallow(){
        this.setHealth(new Health(this, 100));
        this.setWeapon(new Weapon());
        //this.setGroup();
    }
}
