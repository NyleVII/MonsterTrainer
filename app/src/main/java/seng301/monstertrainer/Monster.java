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
                monsterType = "Ogre";
                break;
            case "Troll":
                monsterType = "Troll";
                break;
            case "Orc":
                monsterType = "Orc";
                break;
            case "Goblin":
                monsterType = "Goblin";
                break;
            case "Gremlin":
                monsterType = "Gremlin";
                break;
            case "Imp":
                monsterType = "Imp";
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
