interface GameLevel extends Cloneable {
    GameLevel clone();
    void setName(String n);
    String getName();
}

class EasyLevel implements GameLevel {
    private String name, terrain;

    public EasyLevel(String name, String terrain) {
        this.name = name; this.terrain = terrain;
    }

    private EasyLevel(EasyLevel other) {
        this(other.name, other.terrain);
    }

    @Override public EasyLevel clone() { return new EasyLevel(this); }
    @Override public void setName(String n) { this.name = n; }
    @Override public String getName() { return name; }

    @Override public String toString() { return "EasyLevel{name=" + name + ", terrain=" + terrain + "}"; }
}


public class LevelEditor {
    public static void main(String[] args) {
        EasyLevel base = new EasyLevel("Tutorial Meadow", "forest");
        
        EasyLevel l1 = base.clone();  
        l1.setName("Desert Adventure");
        
        EasyLevel l2 = base.clone();  
        l2.setName("Underwater World");
        
        System.out.println(l1);
        System.out.println(l2);
    }
}
