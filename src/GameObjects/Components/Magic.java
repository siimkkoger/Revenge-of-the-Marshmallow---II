package GameObjects.Components;

import GameObjects.IntelligentObjects.LivingBeing;

public class Magic {

    private int MP = 0;
    private int regainRate = 1; // 1 mana per second - can be affected by spells
    private LivingBeing entity;

    public Magic(LivingBeing entity){
        this.entity = entity;
        this.MP = entity.getDefaultMP();
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

    public LivingBeing getEntity() {
        return entity;
    }

    public void setEntity(LivingBeing entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "Magic{" +
                "MP=" + MP +
                ", entity=" + entity +
                '}';
    }
}
