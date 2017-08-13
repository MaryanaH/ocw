import org.junit.Assert;
import org.junit.Test;
import java.lang.*;

import static org.junit.Assert.*;


public class GravityTest {

    Gravity gravity = new Gravity();

    @Test
    public void testGetFinalPosition() {

        assertEquals(877.375, gravity.getFinalPosition(5.0, 0, 1000.0), 1);

    }
    @Test
    public void testGetFinalPositionIntParam() {

        assertEquals(877.375, gravity.getFinalPosition(5, 0, 1000), 1);

    }
    @Test
    public void testGetFinalPositionThrowsArithmeticException() {

        boolean thrown = false;
        try {
            gravity.getFinalPosition(1, 1, -1000);
            Assert.fail("Expected exception to be thrown");
        } catch (ArithmeticException e) {
            thrown = true;
        }
        assertTrue(thrown);

    }


}
