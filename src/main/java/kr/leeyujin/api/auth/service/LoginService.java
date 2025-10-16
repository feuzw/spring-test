package kr.leeyujin.api.auth.service;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.auth.domain.LoginDTO;
import kr.leeyujin.api.auth.domain.LoginVO;
import kr.leeyujin.api.common.domain.Messenger;

@Service
public class LoginService {

    public Messenger login(LoginDTO loginDTO) {
        System.out.println("로그인 서비스로 들어옴: ");
        System.out.println("서비스로 전달된 아이디: " + loginDTO.getUsername());
        System.out.println("서비스로 전달된 비밀번호: " + loginDTO.getPassword());
        
        LoginVO loginVO = new LoginVO();

        System.out.println("VO에서 서비스로 전달된 아이디: " + loginVO.getUsername());
        System.out.println("VO에서 서비스로 전달된 비밀번호: " + loginVO.getPassword());

        int code = 0;
        String message = "";
        
        if(loginVO.getUsername().equals(loginDTO.getUsername())
        && loginVO.getPassword().equals(loginDTO.getPassword())){
            code = 0;
            message = "로그인 성공";
        }
        else if(loginVO.getUsername().equals(loginDTO.getUsername())
        && !loginVO.getPassword().equals(loginDTO.getPassword())){
            code = 2;
            message = "비밀번호 불일치";
        }
        else{
            code = 1;
            message = "아이디 불일치";
        }

        Messenger messenger = new Messenger();
        messenger.setCode(code);
        messenger.setMessage(message);

        return messenger;

    }


}