package calculatorgroupcalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CalculatorZeroDivideException extends IllegalArgumentException {

    public CalculatorZeroDivideException(String message) {
        super(message);
    }

}
