import com.mvelyka.fooCorporation.WageCalculation;

import org.junit.Test;

import static org.junit.Assert.*;


public class WageCalculationTest {

    @Test
    public void wageCountTest() {
        assertEquals(320, WageCalculation.wageCount(40), 0.1);
    }

    @Test
    public void wageCountLessWorkingHoursTest() {
        assertEquals(280, WageCalculation.wageCount(35), 0.1);
    }

    @Test
    public void wageCountOvertimeTest() {
        assertEquals(600, WageCalculation.wageCount(50), 0.1);
    }
    @Test
    public void wageCountNoWorkTest() {
        assertEquals(0, WageCalculation.wageCount(0), 0.1);
    }


}
