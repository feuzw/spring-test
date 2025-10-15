package kr.leeyujin.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/auth/login")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/auth/register")
    public String register() {
        return "auth/register";
    }

    @GetMapping("/home")
    public String home() {
        return "calculator/home";
    }

    @GetMapping("/calculator/plus")
    public String plus(){
        return "calculator/plus";
    }
    @GetMapping("/calculator/minus")
    public String minus(){
        return "calculator/minus";
    }
    @GetMapping("/calculator/multiple")
    public String multiple(){
        return "calculator/multiple";
    }
    @GetMapping("/calculator/divide")
    public String divide(){
        return "calculator/divide";
    }
}
