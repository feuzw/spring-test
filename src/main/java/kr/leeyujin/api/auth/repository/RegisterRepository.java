package kr.leeyujin.api.auth.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RegisterRepository {
    private String username;
    private String name;
    private String email;
    private String password;
    private String passwordConfirm;
    private String phone;
}
