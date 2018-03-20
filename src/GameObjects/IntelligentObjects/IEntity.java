package GameObjects.IntelligentObjects;

import GameObjects.Components.*;
import GameObjects.Components.Armor.Armor;
import GameObjects.Components.Clothes.Cloth;
import GameObjects.Components.Skills.Skill;
import GameObjects.Components.Spells.Spell;
import GameObjects.Components.Spells.SpellList;
import GameObjects.Components.Weapons.Weapon;

public interface IEntity {
    /*
    TODO : sort out what is needed and what is not.
     */

    // Actions
    public void destroy();
    public void update();
    public void render();

    // Name
    public String getName();
    public void setName(String name);

    // GameObjects.Components - living things
    public Health getHealth();
    public void setHealth(Health health);
    public Magic getMagic();
    public void setMagic(Magic magic);

    // GameObjects.Components - equippables
    public Inventory getInventory();
    public void setInventory(Inventory inventory);
    public Weapon getWeapon();
    public void setWeapon(Weapon weapon);
    public Armor getArmor();
    public void setArmor(Armor armor);
    public Cloth getCloth();
    public void setCloth(Cloth cloth);

    // GameObjects.Components - spells
    public Spell getSpell();
    public void setSpell(Spell spell);
    public SpellList getSpellList();
    public void setSpellList(SpellList spelllist);

    // GameObjects.Components - skills
    public Skill getSkill();
    public void setSkill(Skill skill);

    // GameObjects.Components - that absolutely everything has
    public Body getBody();
    public void setBody(Body body);
    public Physics getPhysics();
    public void setPhysics(Physics physics);
    public View getView();
    public void setView(View view);

    // Signals
    public void entityCreated();
    public Entity entityDestroyed();
}
