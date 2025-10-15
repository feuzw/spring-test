package kr.leeyujin.api.auth.service;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.auth.domain.LoginDTO;
import kr.leeyujin.api.auth.domain.LoginVO;

@Service
public class LoginService {

    public boolean login(LoginDTO loginDTO) {
        System.out.println("로그인 서비스로 들어옴: ");
        System.out.println("서비스로 전달된 아이디: " + loginDTO.getUsername());
        System.out.println("서비스로 전달된 비밀번호: " + loginDTO.getPassword());
        
        LoginVO loginVO = new LoginVO();

        System.out.println("VO에서 서비스로 전달된 아이디: " + loginVO.getUsername());
        System.out.println("VO에서 서비스로 전달된 비밀번호: " + loginVO.getPassword());


        return true;
    }


}