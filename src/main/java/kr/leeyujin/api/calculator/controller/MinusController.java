package kr.leeyujin.api.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.leeyujin.api.calculator.domain.MinusDTO;
import kr.leeyujin.api.calculator.service.MinusService;

@Controller
public class MinusController {

    private final MinusService minusService;

    public MinusController(MinusService minusService){
        this.minusService = minusService;
    }
    
    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {

        System.out.println("뺄셈 컨트롤러로 들어옴");
        System.out.println("화면에서 컨트롤러로 전달된 숫자1: " + num1);
        System.out.println("화면에서 컨트롤러로 전달된 숫자2: " + num2);

        MinusDTO minusDTO = new MinusDTO();
        minusDTO.setNum1(num1);
        minusDTO.setNum2(num2);

        minusService.minus(minusDTO);

        return "calculator/minus";
    }
}
