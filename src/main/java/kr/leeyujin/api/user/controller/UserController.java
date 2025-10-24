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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.user.domain.UserDTO;
import kr.leeyujin.api.user.service.UserService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PostMapping("")
    public String save(Model model) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @PostMapping("/all")
    public String saveAll(Model model) {

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
            Messenger messenger = userService.saveAll(users);
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

    @PutMapping("/{id}")
    public String update(String id, Model model) {
        UserDTO user = new UserDTO();
        user.setUserId(id);
        Messenger messenger = userService.update(user);
        return "user/detail";
    }

    @DeleteMapping("/{id}")
    public String delete(String id, Model model) {
        Messenger messenger = userService.delete(id);
        return "user/list";
    }

    @GetMapping("/id/{id}")
    public String findById(String id, Model model) {
        Messenger messenger = userService.findById(id);
        return "user/detail";
    }

    @GetMapping("/all")
    public String findAll(Model model) {
        Messenger messenger = userService.findAll();
        return "user/list";
    }

}
