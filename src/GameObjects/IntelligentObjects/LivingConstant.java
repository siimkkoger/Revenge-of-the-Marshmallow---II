package GameObjects.IntelligentObjects;

public enum LivingConstant {

    HUMAN(100, 100, 10, 0, "default_human"),
    ELF(70, 200, 10, 0, "default_elf"),
    TROLL(250, 10, 10, 3, "default_troll"),
    MARSHMALLOW(50, 150, 10, 5, "default_marshmallow");
    //private final int mass;
    //private final int speed;
    //... etc ...
    private final int health;
    private final int magic;
    private final int attack;
    private final int defense;
    private final String name;

    LivingConstant(int health, int magic, int attack, int defense, String name){
        this.health = health;
        this.magic = magic;
        this.attack = attack;
        this.defense = defense;
        this.name = name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getMagic(){
        return this.magic;
    }

    public int getAttack(){
        return this.attack;
    }

    public int getDefense(){
        return this.defense;
    }

    public String getName(){
        return this.name;
    }

}
