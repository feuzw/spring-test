package kr.leeyujin.api.calculator.service;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.calculator.domain.PlusDTO;

@Service
public class PlusService {
    
    public boolean plus(PlusDTO plusDTO) {

        System.out.println("덧셈 서비스로 들어옴");
        System.out.println("서비스로 전달된 숫자1: " + plusDTO.getNum1());
        System.out.println("서비스로 전달된 숫자2: " + plusDTO.getNum2());
        System.out.println("덧셈 결과: " + (plusDTO.getNum1() + plusDTO.getNum2()));

        return true;
    }
}