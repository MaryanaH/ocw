import com.mvelyka.fooCorporation.WageCalculation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class WageCalculationTest {

    private WageCalculation underTest = new WageCalculation();
    private int workingHours;
    private int expected;

    public WageCalculationTest(int workingHours, int expected) {
        this.workingHours = workingHours;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 40, 320 }, { 35, 280 }, { 50, 600 }, { 0, 0 }, { 61, 0 }
        });
    }

    @Test
    public void wageCountTest() {
        assertEquals(expected, underTest.wageCount(workingHours), 0.1);
    }

}
