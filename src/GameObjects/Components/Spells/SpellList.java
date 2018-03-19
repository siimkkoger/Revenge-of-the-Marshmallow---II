package GameObjects.Components.Spells;

import GameObjects.IntelligentObjects.Humanoid;
import GameObjects.IntelligentObjects.LivingBeing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class SpellList {

    private Humanoid owner;
    private HashMap<Spell, Boolean> spellMap;

    public SpellList(Humanoid owner){
        this.owner = owner;
        spellMap = new HashMap<>();
        fillMap();
    }

    public void fillMap(){
        spellMap.put(new Fireball(), false);
        spellMap.put(new Icespike(), false);
        for(Spell spell : spellMap.keySet()){
            unlockSpell(spell);
        }
    }

    public void unlockSpell(Spell unlockedSpell){
        spellMap.put(unlockedSpell, true);
    }

    public void changeDamage(Spell spell, int percent){
        spell.changeDamage(percent);
    }
}
