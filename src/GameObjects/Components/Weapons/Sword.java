package GameObjects.Components.Weapons;

import GameObjects.IntelligentObjects.LivingBeing;

public class Sword extends Weapon {

    public Sword(LivingBeing owner){
        super(owner);
    }

    public Sword(){

    }

    @Override
    public int getDefaultDamage() {
        return WeaponConstant.SWORD.getDamage();
    }

    @Override
    public int getDefaultFrequency() {
        return WeaponConstant.SWORD.getFrequency();
    }

    @Override
    public String getDefautlName() {
        return WeaponConstant.SWORD.getName();
    }
}
