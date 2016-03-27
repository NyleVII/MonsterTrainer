package seng301.monstertrainer;



public class Monster {
    private static String monsterType = null;
    private static int hp  =   10;
    private static int maxHP = 10;
    private static int stamina = 15;
    private static int maxStamina = 15;
    private static int loyalty = 0;
    private static int hunger = 0;
    private static int exp = 0;
    private static int maxExp = 100;
    private static int level = 1;

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

    public static int getExp() {
        return exp;
    }

    public static int getMaxExp() {
        return maxExp;
    }

    public static int getHP() {
        return hp;
    }

    public static int getLevel() {
        return level;
    }

    public static int getMaxHP() {return maxHP;}
    public static int getStamina() {
        return stamina;
    }
    public static int getMaxStamina() {
        return maxStamina;
    }
    public static int getLoyalty() {
        return loyalty;
    }

    public static int getHunger() {
        return hunger;
    }

    public void setMonsterType(String newMonsterType) {
        monsterType = newMonsterType;
    }

    public static void setHunger(int hunger) {
        Monster.hunger = hunger;
    }

    public static void setHp(int hp) {
        Monster.hp = hp;
    }

    public static void setLoyalty(int loyalty) {
        Monster.loyalty = loyalty;
    }

    public static void setMaxHP(int maxHP) {
        Monster.maxHP = maxHP;
    }

    public static void setMaxStamina(int maxStamina) {
        Monster.maxStamina = maxStamina;
    }

    public static void setStamina(int stamina) {
        Monster.stamina = stamina;
    }

    public static void setExp(int exp) {
        Monster.exp = exp;
    }

    public static void setMaxExp(int maxExp) {
        Monster.maxExp = maxExp;
    }

    public static void setLevel(int level) {
        Monster.level = level;
    }
}
