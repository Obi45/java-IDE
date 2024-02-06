import Television.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelevisionTest {
    private Television television;

    @BeforeEach
    public void setUp() {
        television = new Television();
    }

    @Test
    public void testThatTelevisionIsOn() {
        assertFalse(television.isOn());
        television.PowerOn();
        assertTrue(television.isOn());
    }

    @Test
    public void testThatTelevisionIsOff() {
        assertFalse(television.isOn());
        television.PowerOn();
        assertTrue(television.isOn());
        television.powerOff();
        assertFalse(television.isOn());
    }

    @Test
    public void testThatTheTelevisionVolumeCanIncrease() {
        television.PowerOn();
        for (int volume = 1; volume >= 80; volume++)
            television.increaseVolume();
    }

    @Test
    public void testThatTheTelevisionVolumeCanDecrease() {
        television.PowerOn();
        for (int volume = 1; volume >= 80; volume++)
            television.increaseVolume();

        for (int volume = 80; volume >= 1; volume--)
            television.decreaseVolume();
    }
}
