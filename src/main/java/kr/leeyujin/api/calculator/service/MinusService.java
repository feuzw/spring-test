package kr.leeyujin.api.calculator.service;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.calculator.domain.MinusDTO;

@Service
public class MinusService {
    
    public boolean minus(MinusDTO minusDTO){
        System.out.println("뺄셈 서비스로 들어옴");
        System.out.println("서비스로 전달된 숫자1: " + minusDTO.getNum1());
        System.out.println("서비스로 전달된 숫자2: " + minusDTO.getNum2());
        System.out.println("뺄셈 결과: " + (minusDTO.getNum1() - minusDTO.getNum2()));
        
        return true;
    }
}
