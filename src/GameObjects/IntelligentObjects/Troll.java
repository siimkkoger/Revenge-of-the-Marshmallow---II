package GameObjects.IntelligentObjects;

import GameObjects.Components.Health;
import GameObjects.Components.Magic;

public class Troll extends LivingBeing{

    private void setBasics(){
        this.setName(LivingConstant.TROLL.getName());
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

    public Troll(){
        this.setBasics();

    }

    public Troll(String name){
        this.setName(name);
        this.setBasics();
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
}
