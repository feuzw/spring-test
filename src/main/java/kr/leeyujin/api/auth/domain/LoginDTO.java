package kr.leeyujin.api.auth.domain;

public class LoginDTO {
    
    private String username;
    private String password;

    
    // Getter 메소드
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    // Setter 메소드
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
