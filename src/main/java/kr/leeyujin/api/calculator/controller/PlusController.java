package kr.leeyujin.api.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.leeyujin.api.calculator.domain.PlusDTO;
import kr.leeyujin.api.calculator.service.PlusService;

@Controller
public class PlusController {

    private final PlusService plusService;

    public PlusController(PlusService plusService) {
        this.plusService = plusService;
    }
    
    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
    
        System.out.println("덧셈 컨트롤러로 들어옴");
        System.out.println("화면에서 컨트롤러로 전달된 숫자1: " + num1);
        System.out.println("화면에서 컨트롤러로 전달된 숫자2: " + num2);

        PlusDTO plusDTO = new PlusDTO();
        plusDTO.setNum1(num1);
        plusDTO.setNum2(num2);

        plusService.plus(plusDTO);


        return "calculator/plus";
    }

}
