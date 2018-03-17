package GameObjects.Components.Armor;

import GameObjects.IntelligentObjects.LivingBeing;

public class Platemail extends Armor {

    public Platemail(){
        super();
    }

    public Platemail(LivingBeing owner){
        super(owner);
    }

    @Override
    public int getDefaultDefense() {
        return ArmorConstant.PLATEMAIL.getDefense();
    }

    @Override
    public String getDefaultName() {
        return ArmorConstant.PLATEMAIL.getName();
    }
}
