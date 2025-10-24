package kr.leeyujin.api.calculator.service;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.calculator.domain.CalculatorDTO;

public interface CalculatorService {

    public int add(CalculatorDTO calculatorDTO);
    public int subtract(CalculatorDTO calculatorDTO);
    public int multiply(CalculatorDTO calculatorDTO);
    public int divide(CalculatorDTO calculatorDTO);
    
}
