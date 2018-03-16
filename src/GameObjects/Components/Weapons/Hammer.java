package GameObjects.Components.Weapons;

import GameObjects.IntelligentObjects.LivingBeing;

public class Hammer extends Weapon{

    public Hammer(LivingBeing owner){
        super(owner);
    }

    public Hammer(){

    }

    @Override
    public int getDefaultDamage() {
        return WeaponConstant.HAMMER.getDamage();
    }

    @Override
    public int getDefaultFrequency() {
        return WeaponConstant.HAMMER.getFrequency();
    }

    @Override
    public String getDefautlName() {
        return WeaponConstant.HAMMER.getName();
    }
}
