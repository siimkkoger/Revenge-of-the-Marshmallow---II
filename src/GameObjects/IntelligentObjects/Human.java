package GameObjects.IntelligentObjects;

import GameObjects.Components.*;

public class Human extends LivingBeing {

    public Human(){
        super();
    }

    public Human(String name){
        super(name);
    }

    @Override
    public int getDefaultHP() {
        return LivingConstant.HUMAN.getHealth();
    }

    @Override
    public int getDefaultMP() {
        return LivingConstant.HUMAN.getMagic();
    }

    @Override
    public int getDefaultAttack() {
        return LivingConstant.HUMAN.getAttack();
    }

    @Override
    public int getDefaultDefense() {
        return LivingConstant.HUMAN.getDefense();
    }

    @Override
    public String getDefaultName() {
        return LivingConstant.HUMAN.getName();
    }

}


























