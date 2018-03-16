package GameObjects.Components.Weapons;

public enum WeaponConstant {

    SWORD(30, 2, "sword"),
    HAMMER(50, 1, "hammer"),
    BOW(15, 1, "bow"),
    SPEAR(25, 1, "spear");

    private final int damage;
    private final int frequency;
    private final String name;

    WeaponConstant(int damage, int frequency, String name) {
        this.damage = damage;
        this.frequency = frequency;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getName() {
        return name;
    }
}
