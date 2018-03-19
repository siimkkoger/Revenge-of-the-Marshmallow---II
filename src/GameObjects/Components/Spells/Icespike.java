package GameObjects.Components.Spells;

import java.util.ArrayList;

public class Icespike extends Spell {
    @Override
    public int getDefaultDamage() {
        return SpellConstant.ICESPIKE.getDamage();
    }

    @Override
    public int getDefaultManaCost() {
        return SpellConstant.ICESPIKE.getManaCost();
    }

    @Override
    public String getDefaultName() {
        return SpellConstant.ICESPIKE.getName();
    }
}
