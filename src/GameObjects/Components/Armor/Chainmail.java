package GameObjects.Components.Armor;

import GameObjects.IntelligentObjects.LivingBeing;

public class Chainmail extends Armor {

    @Override
    public int getDefaultDefense() {
        return ArmorConstant.CHAINMAIL.getDefense();
    }

    @Override
    public String getDefaultName() {
        return ArmorConstant.CHAINMAIL.getName();
    }
}
