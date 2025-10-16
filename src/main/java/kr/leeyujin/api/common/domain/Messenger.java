package kr.leeyujin.api.common.domain;

public class Messenger {
    private int code;
    private String message;

    // Getter 메소드
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    // Setter 메소드
    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
