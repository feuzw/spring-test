package kr.leeyujin.api.calculator.service;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.calculator.domain.CalculatorDTO;

@Service
public class CalculatorService {

    public boolean calculator(CalculatorDTO calculatorDTO){
    
        System.out.println("계산기 서비스로 들어옴");

        if(calculatorDTO.getOperator().equals("plus")){
            System.out.println("결과 : " + calculatorDTO.getNum1() + " + " + calculatorDTO.getNum2() + " = " + (calculatorDTO.getNum1() + calculatorDTO.getNum2()));
        }else if(calculatorDTO.getOperator().equals("minus")){
            System.out.println("결과 : " + calculatorDTO.getNum1() + " - " + calculatorDTO.getNum2() + " = " + (calculatorDTO.getNum1() - calculatorDTO.getNum2()));
        }else if(calculatorDTO.getOperator().equals("multiple")){
            System.out.println("결과 : " + calculatorDTO.getNum1() + " * " + calculatorDTO.getNum2() + " = " + (calculatorDTO.getNum1() * calculatorDTO.getNum2()));
        }else if(calculatorDTO.getOperator().equals("divide")){
            System.out.println("결과 : " + calculatorDTO.getNum1() + " / " + calculatorDTO.getNum2() + " = " + (calculatorDTO.getNum1() / calculatorDTO.getNum2()));
        }
        
        return true;
    }
}
