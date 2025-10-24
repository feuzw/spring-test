package kr.leeyujin.api.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.leeyujin.api.calculator.domain.CalculatorDTO;
import kr.leeyujin.api.calculator.service.CalculatorService;

import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController implements CalculatorService {

    @Override
    public int add(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() + calculatorDTO.getNum2();
    }
    @Override
    public int subtract(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() - calculatorDTO.getNum2();
    }
    @Override
    public int multiply(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() * calculatorDTO.getNum2();
    }
    @Override
    public int divide(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() / calculatorDTO.getNum2();
    }



    // private final CalculatorService calculatorService;

    // public CalculatorController(CalculatorService calculatorService) {
    //     this.calculatorService = calculatorService;
    // }

    // @GetMapping("/move/calculator")
    // public String calculator(@RequestParam int num1, @RequestParam int num2, @RequestParam String operator) {

    //     CalculatorDTO calculatorDTO = new CalculatorDTO();
    //     calculatorDTO.setNum1(num1);
    //     calculatorDTO.setNum2(num2);
    //     calculatorDTO.setOperator(operator);

    //     calculatorService.calculator(calculatorDTO);

    //     return "calculator/calculator";
    // }
}
