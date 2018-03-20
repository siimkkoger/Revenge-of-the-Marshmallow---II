package GameObjects.IntelligentObjects;

import GameObjects.Components.*;
import GameObjects.Components.Armor.Armor;
import GameObjects.Components.Clothes.Cloth;
import GameObjects.Components.Skills.Skill;
import GameObjects.Components.Spells.Spell;
import GameObjects.Components.Spells.SpellList;
import GameObjects.Components.Weapons.Weapon;


public class Entity implements IEntity {

    private Body body;
    private Physics physics;
    private View view;

    private String name;
    private Health health;
    private Magic magic;

    private Weapon weapon;
    private Armor armor;
    private Cloth cloth;

    private Spell spell;
    private SpellList spellList;
    private Skill skill;


    // ----------------------------------------- GRAPHIC METHODS ----------------------------------------
    @Override
    public void destroy() {
        /*
        TODO : It's going to be implemented if groups are needed.
         */
    }

    @Override
    public void update() {
        /*
        TODO : It's going to be implemented when the graphics are added.
         */
    }

    @Override
    public void render() {
        /*
        TODO : It's going to be implemented when the graphics are added.
         */
    }

    // ------------------------------------------ Interface IEntity getters and setters ----------------------------

    // ----------------- BODY / PHYSICS / VIEW ----------------------
    @Override
    public Body getBody() {
        return this.body;
    }

    @Override
    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public Physics getPhysics() {
        return this.physics;
    }

    @Override
    public void setPhysics(Physics physics) {
        this.physics = physics;
    }

    @Override
    public View getView() {
        return this.view;
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }


    // ---------- OTHERS -----------


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Health getHealth() {
        return this.health;
    }

    @Override
    public void setHealth(Health health) {
        this.health = health;
    }

    @Override
    public Magic getMagic() {
        return this.magic;
    }

    @Override
    public void setMagic(Magic magic) {
        this.magic = magic;
    }

    @Override
    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public Armor getArmor() {
        return this.armor;
    }

    @Override
    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public Cloth getCloth() {
        return this.cloth;
    }

    @Override
    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    @Override
    public Spell getSpell() {
        return this.spell;
    }

    @Override
    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    @Override
    public SpellList getSpellList() {
        return this.spellList;
    }

    @Override
    public void setSpellList(SpellList spelllist) {
        this.spellList = spelllist;
    }

    @Override
    public Skill getSkill() {
        return this.skill;
    }

    @Override
    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @Override
    public void entityCreated() {
        System.out.println("A new entity " + this.toString() + " was created!");
    }

    @Override
    public Entity entityDestroyed() {
        System.out.println("A entity " + this.toString() + " was destroyed!");
        return this;
    }



    // ------------------------------------------------ toString and helpers --------------------------------------------
    @Override
    public String toString() {
        return "Entity{" +
                "body=" + body +
                ", physics=" + physics +
                ", view=" + view +
                '}';
    }

}
