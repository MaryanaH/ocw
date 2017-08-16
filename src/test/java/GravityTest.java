import com.mvelyka.ocw.Gravity;
import org.junit.Test;

import java.lang.*;

import static org.junit.Assert.*;


public class GravityTest {

    private Gravity gravity = new Gravity();
    private double precision = 0.001;

    @Test
    public void testGetFinalPosition() {

        assertEquals(877.375, gravity.getFinalPosition(5.0, 0, 1000.0), precision);

    }

    @Test
    public void testGetFinalPositionIntParam() {

        assertEquals(877.375, gravity.getFinalPosition(5, 0, 1000), precision);

    }

    @Test(expected = ArithmeticException.class)
    public void testGetFinalPositionThrowsArithmeticExceptionFallingTime() {

        gravity.getFinalPosition(-1, 1, 1000);
    }

    @Test(expected = ArithmeticException.class)
    public void testGetFinalPositionThrowsArithmeticExceptionInitialVelocity() {

        gravity.getFinalPosition(1, -1, -1000);

    }

    @Test(expected = ArithmeticException.class)
    public void testGetFinalPositionThrowsArithmeticExceptionInitialPosition() {

        gravity.getFinalPosition(1, 1, -1000);

    }


}
