package kr.leeyujin.api.member.domain;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data // Getter, Setter, toString, equals, hashCode 메서드 자동 생성
@AllArgsConstructor // 모든 필드를 포함한 생성자 자동 생성
@NoArgsConstructor // 기본 생성자 자동 생성
public class MemberDTO {
    private String userId;
    private String survived;
    private String pclass;
    private String name;
    private String gender;
    private String age;
    private String sibSp;
    private String parch;
    private String ticket;
    private String fare;
    private String cabin;
    private String embarked;

}