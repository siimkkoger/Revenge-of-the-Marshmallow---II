package GameObjects.Components;

import GameObjects.IntelligentObjects.Humanoid;
import GameObjects.IntelligentObjects.LivingBeing;

public interface Lootable {
    void pickUp(Humanoid looter);
    void lookInfo();
    LivingBeing getOwner();
    void setOwner(Humanoid newOwner);
}
