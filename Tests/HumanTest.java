

import GameObjects.IntelligentObjects.Human;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest{

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getDefName() throws Exception {
        Human human1 = new Human();
        String defName = human1.getDefaultName();
        assertEquals("default_human", defName);
    }


    @Test
    public void getDefName2() throws Exception {
        Human human1 = new Human();
        String defName = human1.getName();
        assertEquals("default_human", defName);
    }

    @Test
    public void getDefNameAfterChange() throws Exception {
        Human human1 = new Human();
        human1.setName("something_different");
        String defName = human1.getDefaultName();
        assertEquals("default_human", defName);
    }

    @Test
    public void getNameFromConstructor() throws Exception {
        Human human1 = new Human("something_different");
        String defName = human1.getName();
        assertEquals("something_different", defName);
    }

    @Test
    public void getNameAfterChange() throws Exception {
        Human human1 = new Human();
        human1.setName("something_different");
        String defName = human1.getName();
        assertEquals("something_different", defName);
    }


//
//    @Test
//    public void getDefaultMP() throws Exception {
//    }
//
//    @Test
//    public void getDefaultAttack() throws Exception {
//    }
//
//    @Test
//    public void getDefaultDefense() throws Exception {
//    }

}