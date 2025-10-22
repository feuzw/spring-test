package kr.leeyujin.api.user.controller;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.user.domain.UserDTO;
import kr.leeyujin.api.user.service.UserService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/auth/register")
    public String registerUsers(Model model) {
        System.out.println("===== CSV 파일 읽기 시작 =====");

        String csvFilePath = "src/main/resources/static/csv/train.csv";

        // 승객 데이터를 저장할 리스트
        List<UserDTO> users = new ArrayList<>();

        try {
            Reader reader = new FileReader(csvFilePath);
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

            int count = 0;
            for (CSVRecord record : csvParser) {
                if (count >= 5)
                    break;

                // 각 승객의 데이터를 맵으로 저장
                UserDTO user = new UserDTO();
                user.setUserId(record.get("PassengerId"));
                user.setSurvived(record.get("Survived"));
                user.setPclass(record.get("Pclass"));
                user.setName(record.get("Name"));
                user.setGender(record.get("Sex"));
                user.setAge(record.get("Age"));
                user.setSibSp(record.get("SibSp"));
                user.setParch(record.get("Parch"));
                user.setTicket(record.get("Ticket"));
                user.setFare(record.get("Fare"));
                user.setCabin(record.get("Cabin"));
                user.setEmbarked(record.get("Embarked"));

                // 리스트에 추가
                users.add(user);
                count++;
            }
            reader.close();
            csvParser.close();

            // 서비스로 데이터 전달 -> 레포지토리에서 터미널 출력
            Messenger messenger = userService.registerUsers(users);
            model.addAttribute("messenger", messenger);
            model.addAttribute("users", users);
            return "user/list";

        } catch (Exception e) {
            Messenger messenger = new Messenger();
            messenger.setCode(500);
            messenger.setMessage("CSV파일을 읽는 중 오류가 발생했습니다.");
            return "user/list";
        }
    }

}
