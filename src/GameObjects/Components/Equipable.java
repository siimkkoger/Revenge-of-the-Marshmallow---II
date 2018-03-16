package GameObjects.Components;

import GameObjects.IntelligentObjects.LivingBeing;

public interface Equipable {
    void equip();
    void unEquip();
    boolean isEquiped();
}
