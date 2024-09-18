package calculatorgroupcalculator.metods;

import org.springframework.stereotype.Component;
import java.util.Objects;

@Component
public class Calculator {

    private int calculator;

    public Calculator() {
        this.calculator = 0;
    }

    public int getCalculator() {
        return calculator;
    }

    public void setCalculator(int calculator) {
        this.calculator = calculator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return calculator == that.calculator;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(calculator);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "calculator=" + calculator +
                '}';
    }
}
