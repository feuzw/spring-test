package kr.leeyujin.api.calculator.service;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.calculator.domain.CalculatorDTO;

@Service
public class CalculatorServiceImpl implements CalculatorService {

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
}
