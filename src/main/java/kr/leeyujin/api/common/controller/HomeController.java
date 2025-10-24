package kr.leeyujin.api.common.controller;

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

    // @GetMapping("/auth/register")
    // public String register() {
    //     return "auth/register";
    // }

    @GetMapping("/calculator")
    public String calculator() {
        return "calculator/calculator";
    }

    @GetMapping("/rrn")
    public String rrn() {
        return "rrn/rrn";
    }
    @GetMapping("/user/list")
    public String userList() {
        return "user/list";
    }
    @GetMapping("/weather/list")
    public String weatherList() {
        return "weather/list";
    }
    @GetMapping("/product/list")
    public String productList() {
        return "product/list";
    }

}
