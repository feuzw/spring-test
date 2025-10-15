package kr.leeyujin.api.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.leeyujin.api.auth.domain.LoginDTO;
import kr.leeyujin.api.auth.service.LoginService;


@Controller
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        
        System.out.println("로그인 컨트롤러로 들어옴");
        System.out.println("화면에서 컨트롤러로 전달된 아이디: " + username);
        System.out.println("화면에서 컨트롤러로 전달된 비밀번호: " + password);

        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUsername(username);
        loginDTO.setPassword(password);

        loginService.login(loginDTO);

        return "auth/login";
    }
}
