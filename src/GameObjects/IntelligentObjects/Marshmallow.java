package GameObjects.IntelligentObjects;

import GameObjects.Components.Health;
import GameObjects.Components.Magic;

public class Marshmallow extends LivingBeing {

    public Marshmallow(){
        super();

    }

    public Marshmallow(String name){
        super(name);
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

    @Override
    public String getDefaultName() {
        return LivingConstant.MARSHMALLOW.getName();
    }
}
