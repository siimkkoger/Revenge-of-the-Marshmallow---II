package GameObjects.Components.Armor;

import GameObjects.IntelligentObjects.Humanoid;
import GameObjects.IntelligentObjects.LivingBeing;

public class Platemail extends Armor {

    @Override
    public int getDefaultDefense() {
        return ArmorConstant.PLATEMAIL.getDefense();
    }

    @Override
    public String getDefaultName() {
        return ArmorConstant.PLATEMAIL.getName();
    }
}
