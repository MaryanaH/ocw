import com.mvelyka.magicSquares.Square;
import org.junit.*;

import static org.junit.Assert.assertEquals;


public class SquareTest {
    Square underTest = new Square();

    @Test
    public void calculateRowSumTest() {
        int sum = underTest.calculateRowSum(0);
        assertEquals(15, sum);
    }

    @Test
    public void calculateColumnSumTest() {
        int sum = underTest.calculateColumnSum(0);
        assertEquals(15, sum);
    }

    @Test
    public void calculateRightDiagonalTest() {
        int sum = underTest.calculateRightDiagonal();
        assertEquals(15, sum);
    }

    @Test
    public void calculateLeftDiagonalTest() {
        int sum = underTest.calculateLeftDiagonal();
        assertEquals(15, sum);
    }

    @Test
    public void checkSumTest() {
        assert underTest.checkSum();
    }
}
