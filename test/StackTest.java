import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {
    private Stack myStack;
    @BeforeEach
    public void setUp(){
        myStack = new Stack();
    }
    @Test
    public void testToCheckIfTheStackIsEmpty(){
        assertTrue(myStack.isEmpty());
    }
}
