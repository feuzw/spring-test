package kr.leeyujin.api.user.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.user.domain.UserDTO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    public Messenger saveUsers(List<UserDTO> users) {
        System.out.println("\n===== 레포지토리: 사용자 데이터 출력 시작 =====\n");

        for (int i = 0; i < users.size(); i++) {
            UserDTO user = users.get(i);
            System.out.println("===== 승객 " + (i + 1) + " =====");
            System.out.println("PassengerId: " + user.getUserId());
            System.out.println("Survived: " + user.getSurvived());
            System.out.println("Pclass: " + user.getPclass());
            System.out.println("Name: " + user.getName());
            System.out.println("Sex: " + user.getGender());
            System.out.println("Age: " + user.getAge());
            System.out.println("SibSp: " + user.getSibSp());
            System.out.println("Parch: " + user.getParch());
            System.out.println("Ticket: " + user.getTicket());
            System.out.println("Fare: " + user.getFare());
            System.out.println("Cabin: " + user.getCabin());
            System.out.println("Embarked: " + user.getEmbarked());
            System.out.println("====================\n");
        }

        System.out.println("===== 레포지토리: 총 " + users.size() + "명의 승객 데이터를 처리했습니다. =====\n");

        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("사용자 등록 성공");
        return messenger;
    }
}
