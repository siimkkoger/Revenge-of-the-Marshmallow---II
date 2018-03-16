package GameObjects.Components.Weapons;

import GameObjects.IntelligentObjects.LivingBeing;

public class Spear extends Weapon {

    public Spear(LivingBeing owner){
        super(owner);
    }

    public Spear(){

    }

    @Override
    public int getDefaultDamage() {
        return WeaponConstant.SPEAR.getDamage();
    }

    @Override
    public int getDefaultFrequency() {
        return WeaponConstant.SPEAR.getFrequency();
    }

    @Override
    public String getDefautlName() {
        return WeaponConstant.SPEAR.getName();
    }

}
