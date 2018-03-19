package GameObjects.Components.Weapons;

import GameObjects.IntelligentObjects.Humanoid;
import GameObjects.IntelligentObjects.LivingBeing;

public class Spear extends Weapon {

    @Override
    public int getDefaultDamage() {
        return WeaponConstant.SPEAR.getDamage();
    }

    @Override
    public int getDefaultFrequency() {
        return WeaponConstant.SPEAR.getFrequency();
    }

    @Override
    public String getDefaultName() {
        return WeaponConstant.SPEAR.getName();
    }

}
