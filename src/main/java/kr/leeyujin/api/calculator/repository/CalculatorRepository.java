package kr.leeyujin.api.calculator.repository;

import org.springframework.stereotype.Repository;

import kr.leeyujin.api.calculator.domain.CalculatorDTO;
import kr.leeyujin.api.calculator.service.CalculatorService;

@Repository
public class CalculatorRepository implements CalculatorService{
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
