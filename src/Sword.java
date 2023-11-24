class Sword extends Equipment {

    public Sword(String name,int level,int weight,int[]stat,Character.PartType type) {
        super(name,level,weight,stat,type);
    }
    public void upgrade() {
        this.level++;
        this.weight -= 2;
        this.stat[0] += 5;
        this.stat[1] += 5;
        this.stat[2] += 100;
    }
}
