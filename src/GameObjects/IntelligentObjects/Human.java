package GameObjects.IntelligentObjects;

import GameObjects.Components.*;

public class Human extends LivingBeing {

    private void setBasics(){
        this.setName(LivingConstant.HUMAN.getName());
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

    public Human(){
        this.setBasics();
    }

    public Human(String name){
        this.setName(name);
        this.setBasics();

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

}


























