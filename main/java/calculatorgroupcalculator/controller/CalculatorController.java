package calculatorgroupcalculator.controller;

import calculatorgroupcalculator.service.CalculatorServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorServiceIml calculatorService;

    @Autowired
    public CalculatorController(CalculatorServiceIml calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path="")
    public String getWelcome() {
        return calculatorService.getWelcome();
    }

    @GetMapping(path="plus")
    public String setCalculationPlus(@RequestParam(required = true) int num1,
                                     @RequestParam(required = true) int num2) {
        return calculatorService.setCalculationPlus(num1, num2);
    }

    @GetMapping(path="minus")
    public String setCalculationMinus(@RequestParam(required = true) int num1,
                                      @RequestParam(required = true) int num2){
        return calculatorService.setCalculationMinus(num1, num2);
    }

    @GetMapping(path="multiply")
    public String setCalculationMultiply(@RequestParam(required = true) int num1,
                                         @RequestParam(required = true) int num2) {
        return calculatorService.setCalculationMultiply(num1, num2);
    }

    @GetMapping(path="divide")
    public String setCalculationDivide(@RequestParam(required = true) int num1,
                                       @RequestParam(required = true) int num2) {
        return calculatorService.setCalculationDivide(num1, num2);
    }

}
