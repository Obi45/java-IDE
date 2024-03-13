import List.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class ReversedTest {
    @Test
    public void testThatAListCanBeReversed() {
        List myList = new List();
        int[] actual = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, myList.reversedList(actual));

    }
    @Test
    public void testThatAListCanHoldElementAtEvenIndex(){
        List myList = new List();
        int[] actual = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 3, 5};
        assertArrayEquals(expected, myList.evenIndex(actual));

    }


}
