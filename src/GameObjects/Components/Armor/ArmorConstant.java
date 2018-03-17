package GameObjects.Components.Armor;

public enum ArmorConstant {
    CHAINMAIL(50, "chainmail"),
    PLATEMAIL(60, "platemail");

    private final int defense;
    private final String name;

    ArmorConstant(int defense, String name) {
        this.defense = defense;
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }
}
