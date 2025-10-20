package kr.leeyujin.api.auth.controller;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class RegisterController implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("===== CSV 파일 읽기 시작 =====");

        String csvFilePath = "src/main/resources/static/csv/train.csv";

        // 승객 데이터를 저장할 리스트
        List<Map<String, String>> passengerList = new ArrayList<>();

        try (Reader reader = new FileReader(csvFilePath);
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {

            int count = 0;
            for (CSVRecord record : csvParser) {
                if (count >= 5)
                    break;

                // 각 승객의 데이터를 맵으로 저장
                Map<String, String> passengerData = new HashMap<>();
                passengerData.put("PassengerId", record.get("PassengerId"));
                passengerData.put("Survived", record.get("Survived"));
                passengerData.put("Pclass", record.get("Pclass"));
                passengerData.put("Name", record.get("Name"));
                passengerData.put("Sex", record.get("Sex"));
                passengerData.put("Age", record.get("Age"));

                // 리스트에 추가
                passengerList.add(passengerData);
                count++;
            }

            // 리스트에서 데이터 출력
            System.out.println("===== 승객 데이터 리스트 출력 =====");
            for (int i = 0; i < passengerList.size(); i++) {
                Map<String, String> passenger = passengerList.get(i);
                System.out.println("===== 승객 " + (i + 1) + " =====");
                System.out.println("PassengerId: " + passenger.get("PassengerId"));
                System.out.println("Survived: " + passenger.get("Survived"));
                System.out.println("Pclass: " + passenger.get("Pclass"));
                System.out.println("Name: " + passenger.get("Name"));
                System.out.println("Sex: " + passenger.get("Sex"));
                System.out.println("Age: " + passenger.get("Age"));
                System.out.println("====================");
            }

            System.out.println("===== CSV 파일 읽기 완료 =====");
            System.out.println("총 " + passengerList.size() + "명의 승객 데이터를 읽었습니다.");

        } catch (Exception e) {
            System.out.println("CSV 파일 읽기 오류: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
