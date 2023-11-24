class Armor extends Equipment {


    public Armor(String name,int level,int weight,int[]stat,Character.PartType type) {
        super(name,level,weight,stat , type);
    }
    public void upgrade() {
        this.level++;
        this.weight -= 3;
        this.stat[0] += 20;
        this.stat[1] += 20;
        this.stat[3] += 4;
    }
}
