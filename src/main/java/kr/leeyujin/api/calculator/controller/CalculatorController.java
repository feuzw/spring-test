package kr.leeyujin.api.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.leeyujin.api.calculator.domain.CalculatorDTO;
import kr.leeyujin.api.calculator.service.CalculatorService;

import org.springframework.stereotype.Controller;

@Controller
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    
    @GetMapping("/move/calculator")
    public String calculator(@RequestParam int num1, @RequestParam int num2, @RequestParam String operator){

        CalculatorDTO calculatorDTO = new CalculatorDTO();
        calculatorDTO.setNum1(num1);
        calculatorDTO.setNum2(num2);
        calculatorDTO.setOperator(operator);

        calculatorService.calculator(calculatorDTO);
        
        return "calculator/calculator";
    }
}
