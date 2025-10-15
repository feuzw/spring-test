package kr.leeyujin.api.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.leeyujin.api.calculator.domain.MultipleDTO;
import kr.leeyujin.api.calculator.service.MultipleService;

@Controller
public class MultipleController {

    private final MultipleService multipleService;

    public MultipleController(MultipleService multipleService){
        this.multipleService=multipleService;
    }
    
    @GetMapping("/multiple")
    public String multiple(@RequestParam int num1, @RequestParam int num2){

        System.out.println("곱셈 컨트롤러로 들어옴");
        System.out.println("화면에서 컨트롤러로 전달된 숫자1: " + num1);
        System.out.println("화면에서 컨트롤러로 전달된 숫자2: " + num2);

        MultipleDTO multipleDTO = new MultipleDTO();
        multipleDTO.setNum1(num1);
        multipleDTO.setNum2(num2);

        multipleService.multiple(multipleDTO);

        return "calculator/multiple";
    }
}
