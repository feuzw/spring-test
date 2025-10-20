package kr.leeyujin.api.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.leeyujin.api.auth.domain.LoginDTO;
import kr.leeyujin.api.auth.service.LoginService;
import kr.leeyujin.api.common.domain.Messenger;

@Controller
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String login(@RequestParam(name = "username") String username,
            @RequestParam(name = "password") String password, Model model) {

        System.out.println("로그인 컨트롤러로 들어옴");
        System.out.println("화면에서 컨트롤러로 전달된 아이디: " + username);
        System.out.println("화면에서 컨트롤러로 전달된 비밀번호: " + password);

        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUsername(username);
        loginDTO.setPassword(password);

        // Messenger messenger = new Messenger();
        // messenger = loginService.login(loginDTO);
        Messenger messenger = loginService.login(loginDTO);

        System.out.println("서비스에서 컨트롤러로 리턴한 코드: " + messenger.getCode());
        System.out.println("서비스에서 컨트롤러로 리턴한 메시지: " + messenger.getMessage());

        model.addAttribute("messenger", messenger);

        return "auth/login";
    }
}
