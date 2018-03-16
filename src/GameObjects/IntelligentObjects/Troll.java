package GameObjects.IntelligentObjects;

import GameObjects.Components.Health;
import GameObjects.Components.Magic;

public class Troll extends LivingBeing{

    public Troll(){
        super();

    }

    public Troll(String name){
        super(name);
    }

    @Override
    public int getDefaultHP() {
        return LivingConstant.TROLL.getHealth();
    }

    @Override
    public int getDefaultMP() {
        return LivingConstant.TROLL.getMagic();
    }

    @Override
    public int getDefaultAttack() {
        return LivingConstant.TROLL.getAttack();
    }

    @Override
    public int getDefaultDefense() {
        return LivingConstant.TROLL.getDefense();
    }

    @Override
    public String getDefaultName() {
        return LivingConstant.TROLL.getName();
    }
}
