package GameObjects.Components.Weapons;

import GameObjects.IntelligentObjects.Humanoid;

public class Sword extends Weapon {

    public Sword(Humanoid owner){
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
    public String getDefaultName() {
        return WeaponConstant.SWORD.getName();
    }
}
