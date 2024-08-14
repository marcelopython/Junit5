package br.com.unit;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Test math operations SimpleMath")
public class SimpleMathTest {

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTowIsAddedByTwo_ShouldReturnEightDotTwo() {

        SimpleMath math = new SimpleMath();
        Double actual = math.sum(6.2D, 2D);
        double expected = 8.2D;
        assertEquals(expected, actual, () -> "The testSum() did not produce expected result");
    }

    @Test
    void testDivision_When_firstNumberIsDividedByZero_ShouldThrowArithmeticException() {

    }

    @Test
    void testSubtraction() {
        SimpleMath math = new SimpleMath();
        double actual = math.subtraction(1.0D, 2.0D);
        double expected = -1.0D;
        assertEquals(expected, actual, () -> "expected is not "+expected );
    }

    @Test
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        double actual = math.multiplication(2.0D, 2.0D);
        double expected = 4.0D;
        assertEquals(expected, actual, () -> "expected is not "+ expected);
    }

    @Test
    void testDivision() {
        SimpleMath math = new SimpleMath();
        double actual = math.division(2.0D, 2.0D);
        double expected = 1.0D;
        assertEquals(expected, actual, () -> "expected is not "+ expected);
    }

    @Test
    void testMean() {
        SimpleMath math = new SimpleMath();
        double actual = math.mean(2.0D, 2.0D);
        double expected = 2.0D;
        assertEquals(expected, actual, () -> "expected is not "+ expected);
    }

    @Test
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        double actual = math.squareRoot(3.0D);
        double expected = 1.7320508075688772D;
        assertEquals(expected, actual, () -> "expected is not "+ expected);
    }


}
