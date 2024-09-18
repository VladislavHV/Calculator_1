package calculatorgroupcalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CalculatorZeroException extends RuntimeException {

    public CalculatorZeroException(String message) {
        super(message);
    }

}
