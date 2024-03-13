import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WorkTest {
    private Work myWork;
    @BeforeEach
        public void setUp(){
        myWork = new Work();
    }
    @Test
    public void testThatTheListIsEmpty(){
        assertTrue(myWork.isEmpty());
    }
    @Test
    public void testThatNamesCanBeAddedToAList(){
        assertTrue(myWork.isEmpty());
        myWork.add("Godwin");
        assertFalse(myWork.isEmpty());

    }
    @Test
    public void testThatNamesCanBeRemovedFromAList(){
        assertTrue(myWork.isEmpty());
        myWork.add("Godwin");
        assertFalse(myWork.isEmpty());
        myWork.remove("Godwin");
        assertTrue(myWork.isEmpty());

    }
    @Test
     public void testThatWhenMoreThanOneNameIsAddedAndOneIsSubtractedTheListWillNotTurnToZero(){
        assertTrue(myWork.isEmpty());
        myWork.add("Godwin");
        myWork.add("obi");
        assertFalse(myWork.isEmpty());
        myWork.remove("Godwin");
        assertFalse(myWork.isEmpty());

    }
    @Test
    public void testThatItemCanBeInsertedToAList(){
        assertTrue(myWork.isEmpty());
        myWork.insert[1] = "Godwin ";
       // assertFalse(myWork.isEmpty());
    }


}
