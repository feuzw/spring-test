package kr.leeyujin.api.calculator.service;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.calculator.domain.DivideDTO;

@Service
public class DivideService {
    
    public boolean divide(DivideDTO divideDTO){
        System.out.println("나눗셈 서비스로 들어옴");
        System.out.println("서비스로 전달된 숫자1: " + divideDTO.getNum1());
        System.out.println("서비스로 전달된 숫자2: " + divideDTO.getNum2());
        System.out.println("나눗셈 결과: " + (divideDTO.getNum1()/divideDTO.getNum2()));

        return true;
    }
}
