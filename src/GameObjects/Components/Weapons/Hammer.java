package GameObjects.Components.Weapons;

import GameObjects.IntelligentObjects.Humanoid;
import GameObjects.IntelligentObjects.LivingBeing;

public class Hammer extends Weapon{

    @Override
    public int getDefaultDamage() {
        return WeaponConstant.HAMMER.getDamage();
    }

    @Override
    public int getDefaultFrequency() {
        return WeaponConstant.HAMMER.getFrequency();
    }

    @Override
    public String getDefaultName() {
        return WeaponConstant.HAMMER.getName();
    }
}
