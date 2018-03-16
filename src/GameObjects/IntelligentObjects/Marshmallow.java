package GameObjects.IntelligentObjects;

import GameObjects.Components.Health;
import GameObjects.Components.Magic;

public class Marshmallow extends LivingBeing {

    private void setBasics(){
        this.setName(LivingConstant.MARSHMALLOW.getName());
        this.setHealth(new Health(this));
        this.setMagic(new Magic(this));
        this.setAttack(getDefaultAttack());
        this.setDefense(getDefaultDefense());
        /*
        TODO : 1) setBody
        TODO : 2) setPhysics
        TODO : 3) setView
         */

    }

    public Marshmallow(){
        this.setBasics();

    }

    public Marshmallow(String name){
        this.setName(name);
        this.setBasics();
    }

    @Override
    public int getDefaultHP() {
        return LivingConstant.MARSHMALLOW.getHealth();
    }

    @Override
    public int getDefaultMP() {
        return LivingConstant.MARSHMALLOW.getMagic();
    }

    @Override
    public int getDefaultAttack() {
        return LivingConstant.MARSHMALLOW.getAttack();
    }

    @Override
    public int getDefaultDefense() {
        return LivingConstant.MARSHMALLOW.getDefense();
    }
}
