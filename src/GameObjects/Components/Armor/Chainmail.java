package GameObjects.Components.Armor;

import GameObjects.IntelligentObjects.LivingBeing;

public class Chainmail extends Armor {

    public Chainmail(){
        super();
    }

    public Chainmail(LivingBeing owner){
        super(owner);
    }

    @Override
    public int getDefaultDefense() {
        return ArmorConstant.CHAINMAIL.getDefense();
    }

    @Override
    public String getDefaultName() {
        return ArmorConstant.CHAINMAIL.getName();
    }
}
