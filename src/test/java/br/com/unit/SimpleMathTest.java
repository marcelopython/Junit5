package br.com.unit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Test math operations SimpleMath")
public class SimpleMathTest {

    SimpleMath math;

//    Primeiro ser rodado
//    setup()

//    Segundo a ser rodado
//    beforeEach()

//    Terceiro a ser rodado e fodado em cada teste
//  afterEach()

//    Quero a ser rodado executado depois de todos serem dodados
//    afterAll()

    @BeforeAll
    static void setup() {
        System.out.println("Running @BeforeAll method!");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll method!");
    }

    @BeforeEach
    void beforeEachMethod() {
        System.out.println("Running @BeforeEach method!");
        this.math = new SimpleMath();
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("Running @AfterEach method!");
    }

    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTowIsAddedByTwo_ShouldReturnEightDotTwo() {
        System.out.println("Teste testSum_When_SixDotTowIsAddedByTwo_ShouldReturnEightDotTwo");
        // AAA Arrange, Act, Assert

        // Given (Onde prepara as variaveis o que vai ser testado) Arrange

            double firstNumber = 6.2D;
            double secondNumber = 2D;

        // When (O que vai ser testado) Act
            Double actual = math.sum(firstNumber, secondNumber);

        // Then (onde verifica e se o o experado, onde que fica o codigo de teste) Assert
            double expected = 8.2D;
            assertEquals(expected, actual, () -> "The testSum() did not produce expected result");
    }

//    @Disabled("TODO: we need")
    @Test
    void testDivision_When_firstNumberIsDividedByZero_ShouldThrowArithmeticException() {

        // given
        double firstNumber = 2D;
        double secondNumber = 0D;

        String expectedMessage = "Impossible to divide by zero!";

        ArithmeticException actual = assertThrows(ArithmeticException.class,
                // when & then
                () -> math.division(firstNumber, secondNumber),
                () -> "Division by zero should throw an ArithmeticException"
        );

        assertEquals(expectedMessage, actual.getMessage());

    }

    @Test
    void testSubtraction() {
        System.out.println("Teste testSubtraction");
        double actual = math.subtraction(1.0D, 2.0D);
        double expected = -1.0D;
        assertEquals(expected, actual, () -> "expected is not "+expected );
    }

    @Test
    void testMultiplication() {
        System.out.println("Teste testMultiplication");
        double actual = math.multiplication(2.0D, 2.0D);
        double expected = 4.0D;
        assertEquals(expected, actual, () -> "expected is not "+ expected);
    }

    @Test
    void testDivision() {
        System.out.println("Teste testDivision");
        double actual = math.division(2.0D, 2.0D);
        double expected = 1.0D;
        assertEquals(expected, actual, () -> "expected is not "+ expected);
    }

    @Test
    void testMean() {
        System.out.println("Teste testMean");
        double actual = math.mean(2.0D, 2.0D);
        double expected = 2.0D;
        assertEquals(expected, actual, () -> "expected is not "+ expected);
    }

    @Test
    void testSquareRoot() {
        System.out.println("Teste testSquareRoot");
        double actual = math.squareRoot(3.0D);
        double expected = 1.7320508075688772D;
        assertEquals(expected, actual, () -> "expected is not "+ expected);
    }


}
