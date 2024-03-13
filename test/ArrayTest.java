import ArrayTask.ArrayTask;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayTest {
    @Test
    public  void testThatFunctionsPicksElementInOddPosition(){
        ArrayTask arrayTask = new ArrayTask();
        int[] result = {3, 4, 7,4,5};
        int[] expected = {3,7,5};
        assertArrayEquals(expected, arrayTask.checkOddNumber(result));
    }
}
