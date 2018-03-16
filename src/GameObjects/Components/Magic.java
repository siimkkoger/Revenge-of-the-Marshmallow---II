package GameObjects.Components;

import GameObjects.IntelligentObjects.LivingBeing;

public class Magic {

    private int MP = 0;
    private int regainRate = 1; // 1 mana per second - can be affected by spells
    private LivingBeing owner;

    public Magic(LivingBeing owner){
        this.owner = owner;
        this.MP = owner.getDefaultMP();
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getRegainRate() {
        return regainRate;
    }

    public void setRegainRate(int regainRate) {
        this.regainRate = regainRate;
    }

    public LivingBeing getOwner() {
        return owner;
    }

    public void setOwner(LivingBeing owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Magic{" +
                "MP=" + MP +
                ", owner=" + owner +
                '}';
    }
}
