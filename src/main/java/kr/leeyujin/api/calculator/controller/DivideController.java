package kr.leeyujin.api.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.leeyujin.api.calculator.domain.DivideDTO;
import kr.leeyujin.api.calculator.service.DivideService;

@Controller
public class DivideController {

    private final DivideService divideService;

    public DivideController(DivideService divideService){
        this.divideService=divideService;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2){
        System.out.println("나눗셈 컨트롤러로 들어옴");
        System.out.println("화면에서 컨트롤러로 전달된 숫자1: " + num1);
        System.out.println("화면에서 컨트롤러로 전달된 숫자2: " + num2);

        DivideDTO divideDTO = new DivideDTO();
        divideDTO.setNum1(num1);
        divideDTO.setNum2(num2);

        divideService.divide(divideDTO);

        return "calculator/divide";
    }
}
