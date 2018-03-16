package GameObjects.Components;

public class Group<Entity> {

    private String name;
    private Group<Entity> allies;
    private Group<Entity> enemies;

    public Group(String name){
        this.name = name;
    }


}
