import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CylinderTest {
    @Test
    public void testThatChecksIfACylinderHaveAHeight() {
        Cylinder myCylinder = new Cylinder();
        double actual = 1.0;
        double expected = 0.0;
        assertEquals(expected, myCylinder.getHeight());

    }

    @Test
    public void testThatChecksIfACylinderHaveARadius() {
        Cylinder myCylinder = new Cylinder();
        double actual = 1.0;
        double expected = 0.0;
        assertEquals(expected, myCylinder.getRadius());

    }

    @Test
    public void testThatCalculateTheVolumeOfACylinder() {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(4);
        myCylinder.setRadius(2);
        double expected = 50.288;
        assertEquals(expected, myCylinder.getCylinderVolume());

    }
    @Test
    public void testThatCalculateThatVolumeOfCylinderWhenUserPassNegativeValues(){
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(-6);
        myCylinder.setRadius(2);
        double expected = -75.432;
    }

}

