package calculatorgroupcalculator.service;

import calculatorgroupcalculator.exception.CalculatorZeroException;
import calculatorgroupcalculator.exception.CalculatorZeroDivideException;
import calculatorgroupcalculator.metods.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceIml implements CalculatorService {

    private final
    Calculator calculator;

    @Autowired
    public CalculatorServiceIml(Calculator calculator) {
        this.calculator = calculator;
    }

    public String getWelcome() {
        return "Добро пожаловать в калькулятор.";
    }

    public String setCalculationPlus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String setCalculationMinus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String setCalculationMultiply(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            throw new CalculatorZeroException("Умножение на ноль запрешено!");
        }
        return num1 +  " * " + num2 + " = " + (num1 * num2);
    }

    public String setCalculationDivide(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            throw new CalculatorZeroDivideException("Деление на ноль невозможно!");
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

}
