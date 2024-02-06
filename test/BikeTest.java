
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void testThatBikeIsOn() {
        assertFalse(bike.isOn());
        bike.powerOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void testThatBikeisOff() {
        assertFalse(bike.isOn());
        bike.powerOn();
        assertTrue(bike.isOn());
        bike.powerOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void testThatBikeCanAccelerate() {
        bike.powerOn();
        for (int movement = 1; movement <= 10; movement++)
            bike.accelerate();

        assertEquals(10, bike.getBikeSpeed());


    }

    @Test
    public void testThatBikeCanDecelerate() {
        bike.powerOn();
        for (int movement = 1; movement <= 10; movement++)
            bike.accelerate();

        for (int movement = 9; movement >= 1; movement--) {
            bike.deccelerate();
        }
    }


    @Test
    public void testThatGearCanBeSwitched(){
        bike.powerOn();
        for(int movement = 1; movement <= 50; movement++)
         bike.accelerate();

            assertEquals(4, bike.switchGear());

    }
}



