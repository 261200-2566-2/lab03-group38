public class Equipment {
    protected  String name;
    protected  int level;

    protected  int weight;

    protected Character.PartType type;
    protected  int[] stat;

    public Equipment(String name,  int level,int weight ,int[]stat,Character.PartType type) {
        this.name = name;
        this.level = level;
        this.weight = weight;
        this.stat = stat;
        this.type = type;
    }

    public int getLevel() {
        return level;
    }
    public int getWeight() {
        return weight;
    }
    public int[] getStat() {
        return stat;
    }
    public void upgrade() {
        this.level++;
    }
}

