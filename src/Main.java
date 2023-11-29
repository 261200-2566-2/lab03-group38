import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Character.PartType,Equipment> equipmentMap = new HashMap<Character.PartType, Equipment>();
        String swordName = "Player 1 Sword";
        int swordLevel = 5;
        int swordWeight = 20;
        int[] swordStats = {50, 50, 10,10 ,5};
        Character.PartType swordPartType = Character.PartType.WEAPON;
        Sword mySword = new Sword(swordName, swordLevel, swordWeight, swordStats,swordPartType);
        equipmentMap.put(Character.PartType.WEAPON,mySword);
        Character p1 = new Character(1, 100, 100, 5, 10,5,equipmentMap); // Speed Decrease to 8 After equip weapon
        System.out.println("Player 1 Hp = " + p1.getHp());
        System.out.println("Player 1 Mana = " + p1.getMana());
        System.out.println("Player 1 Attack = " + p1.getAttack());
        System.out.println("Player 1 Def = " + p1.getDef());
        System.out.println("Player 1 Exp = " + p1.getExp());
        System.out.println("Player 1 RunSpeed = " + p1.getRunSpeed());


        Character p2 = new Character(1, 100, 100, 5, 10,5,equipmentMap);
        p2.attack(p1);
        System.out.println("Player 1 Hp after attacked by p2 = " + p1.getHp());
        p1.upgrade(Character.PartType.WEAPON);
        System.out.println("Upgrade sword to level " + mySword.getLevel());
        p1.attack(p2);
        System.out.println("Player 1 Hp after attacked by p2 = " + p2.getHp());

    }
}