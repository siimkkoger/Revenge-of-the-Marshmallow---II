package GameObjects.Components.Spells;

import java.util.ArrayList;

public class Fireball extends Spell {
    @Override
    public int getDefaultDamage() {
        return SpellConstant.FIREBALL.getDamage();
    }

    @Override
    public int getDefaultManaCost() {
        return SpellConstant.FIREBALL.getManaCost();
    }

    @Override
    public String getDefaultName() {
        return SpellConstant.FIREBALL.getName();
    }

}
