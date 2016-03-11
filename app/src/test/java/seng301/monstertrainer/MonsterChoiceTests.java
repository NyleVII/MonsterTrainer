package seng301.monstertrainer;

import org.junit.Test;

import static org.junit.Assert.*;
import static seng301.monstertrainer.Monster.getMonsterType;

/**
 * Some tests that can pass or fail
 */
public class MonsterChoiceTests {
    Monster m = new Monster();
    @Test
    public void chooseOgreTest() throws Exception {
        m.setMonsterType("OGRE");
        assertEquals("OGRE", getMonsterType());
    }

    @Test
    public void chooseTrollTest() throws Exception {
        m.setMonsterType("");
        assertEquals("TROLL", getMonsterType());
    }

    @Test
    public void chooseGoblinTest() throws Exception {
        m.setMonsterType("");
        assertEquals("GOBLIN", getMonsterType());
    }

    @Test
    public void chooseImpTest() throws Exception {
        m.setMonsterType("");
        assertEquals("IMP", getMonsterType());
    }

    @Test
    public void chooseOrcTest() throws Exception {
        m.setMonsterType("");
        assertEquals("ORC", getMonsterType());
    }

    @Test
    public void chooseGremlinTest() throws Exception {
        m.setMonsterType("");
        assertEquals("GREMLIN", getMonsterType());
    }

}