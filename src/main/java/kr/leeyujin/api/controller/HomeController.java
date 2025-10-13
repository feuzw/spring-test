package kr.leeyujin.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "auth/signup";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/calculator/plus")
    public String plus(){
        return "contents/calculator/plus";
    }
    @GetMapping("/calculator/minus")
    public String minus(){
        return "contents/calculator/minus";
    }
    @GetMapping("/calculator/multiple")
    public String multiple(){
        return "contents/calculator/multiple";
    }
    @GetMapping("/calculator/divide")
    public String divide(){
        return "contents/calculator/divide";
    }
    
}