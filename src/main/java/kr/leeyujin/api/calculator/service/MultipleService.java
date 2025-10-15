package kr.leeyujin.api.calculator.service;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.calculator.domain.MultipleDTO;

@Service
public class MultipleService {
    
    public boolean multiple(MultipleDTO multipleDTO){
        System.out.println("곱셈 서비스로 들어옴");
        System.out.println("서비스로 전달된 숫자1: " + multipleDTO.getNum1());
        System.out.println("서비스로 전달된 숫자2: " + multipleDTO.getNum2());
        System.out.println("곱셈 결과: " + (multipleDTO.getNum1()*multipleDTO.getNum2())) ;
        
        return true;
    }

}
