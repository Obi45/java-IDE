import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test
    public void testMainAdd(){

        int actual = Main.add(10, 5);
        assertEquals(15, actual);
    }

    @Test
    public void testMainSubtract(){
        Main main = new Main();

        int actual = main.subtract(10, 5);
        assertEquals(5, actual);
    }

}