package kr.leeyujin.api.auth.domain;

public class RegisterDTO {
    private String username;
    private String name;
    private String email;
    private String password;
    private String passwordConfirm;
    private String phone;

    public String getUsername(){
        return username;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getPasswordConfirm(){
        return passwordConfirm;
    }
    public String getPhone(){
        return phone;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setPasswordConfirm(String passwordConfirm){
        this.passwordConfirm=passwordConfirm;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
}
