package calculatorgroupcalculator.service;

import calculatorgroupcalculator.exception.CalculatorZeroDivideException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImlTest {

    @InjectMocks
    private CalculatorServiceIml calculatorServiceIml;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetWelcome() {
        assertEquals("Добро пожаловать в калькулятор.", calculatorServiceIml.getWelcome());
    }

    public void testSetCalculationPlus(int num1, int num2, int expected) {
        String result = calculatorServiceIml.setCalculationPlus(num1, num2);
        assertEquals(num1 + " + " + num2 + " = " + expected, result);
    }

    public void testSetCalculationMinus(int num1, int num2, int expected) {
        String result = calculatorServiceIml.setCalculationMinus(num1, num2);
        assertEquals(num1 + " - " + num2 + " = " + expected, result);
    }

    public void testSetCalculationMultiply(int num1, int num2, int expected) {
        String result = calculatorServiceIml.setCalculationMultiply(num1, num2);
        assertEquals(num1 + " * " + num2 + " = " + expected, result);
    }

    public void testSetCalculationDivide(int num1, int num2, int expected) {
        String result = calculatorServiceIml.setCalculationDivide(num1, num2);
        assertEquals(num1 + " / " + num2 + " = " + expected, result);
    }

    @Test
    public void testSetCalculationDivideException() {
        CalculatorZeroDivideException exception = assertThrows(CalculatorZeroDivideException.class, () -> {
            calculatorServiceIml.setCalculationDivide(10, 0);
        });
        assertEquals("Деление на ноль невозможно!", exception.getMessage());
    }
}
