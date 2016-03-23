package seng301.monstertrainer;



public class Monster {
    private static String monsterType = null;
    private int hp  =   1;
    private int maxHp = 1;
    private int stamina = 1;
    private int maxStamina = 1;
    private int loyalty = 1;
    private int hunger = 1;

    //Constructor(s)z
    public Monster(){
        //Empty constructor
    }
    public Monster(String desiredType){
        switch (desiredType) {
            case "Ogre":
                monsterType = "ogre";
                break;
            case "Troll":
                monsterType = "troll";
                break;
            case "Orc":
                monsterType = "orc";
                break;
            case "Goblin":
                monsterType = "goblin";
                break;
            case "Gremlin":
                monsterType = "gremlin";
                break;
            case "Imp":
                monsterType = "imp";
                break;
            default:
                monsterType = "ERROR";
                break;
        }
    }

    public static String getMonsterType() { return monsterType; }
    public int getHp() {
        return hp;
    }
    public int getStamina() {
        return stamina;
    }
    public int getLoyalty() {
        return loyalty;
    }

    public void setMonsterType(String newMonsterType) {
        monsterType = newMonsterType;
    }
}
