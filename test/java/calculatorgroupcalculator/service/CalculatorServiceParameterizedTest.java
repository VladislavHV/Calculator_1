package calculatorgroupcalculator.service;

import calculatorgroupcalculator.metods.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorServiceParameterizedTest {

    private CalculatorServiceIml calculatorServiceIml;

    @BeforeEach
    public void setUp() {
        calculatorServiceIml = new CalculatorServiceIml(new Calculator());
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAddition")
    public void testSetCalculationPlus(int num1, int num2, String result) {
        assertEquals(result, calculatorServiceIml.setCalculationPlus(num1, num2));
    }

    private Stream<Arguments> provideArgumentsAddition() {
        return Stream.of(
                Arguments.of(5,3,"5 + 3 = 8"),
                Arguments.of(1,1,"1 + 1 = 2"),
                Arguments.of(20,9,"20 + 9 = 29")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSubtraction")
    public void testSetCalculationMinus(int num1, int num2, String result) {
        assertEquals(result, calculatorServiceIml.setCalculationMinus(num1, num2));
    }

    private Stream<Arguments> provideArgumentsForSubtraction() {
        return Stream.of(
                Arguments.of(5,10,"5 - 10 = -5"),
                Arguments.of(6,3,"6 - 3 = 3"),
                Arguments.of(29,9,"29 - 9 = 20")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMultiplication")
    public void testSetCalculationMultiply(int num1, int num2, String result) {
        assertEquals(result, calculatorServiceIml.setCalculationMultiply(num1, num2));
    }

    private Stream<Arguments> provideArgumentsForMultiplication() {
        return Stream.of(
                Arguments.of(5,2,"5 * 2 = 10"),
                Arguments.of(8,5,"8 * 5 = 40"),
                Arguments.of(9,9,"9 * 9 = 81")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForDivision")
    public void testSetCalculationDivide(int num1, int num2, String result) {
        assertEquals(result, calculatorServiceIml.setCalculationDivide(num1, num2));
    }

    private Stream<Arguments> provideArgumentsForDivision() {
        return Stream.of(
                Arguments.of(9,3,"9 / 3 = 3"),
                Arguments.of(10,5,"10 / 5 = 2"),
                Arguments.of(7,3,"7 / 3 = 2")
        );
    }

}
