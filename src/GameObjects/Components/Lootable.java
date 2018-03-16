package GameObjects.Components;

import GameObjects.IntelligentObjects.LivingBeing;

public interface Lootable {
    void pickUp(LivingBeing looter);
    void lookInfo();
}
