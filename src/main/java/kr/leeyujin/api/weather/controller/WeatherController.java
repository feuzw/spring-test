package kr.leeyujin.api.weather.controller;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.weather.domain.WeatherDTO;
import kr.leeyujin.api.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/weather")
    public Messenger getWeather() {
        String csvFilePath = "src/main/resources/static/csv/weather.csv";

        List<WeatherDTO> weathers = new ArrayList<>();

        try {
            Reader reader = new FileReader(csvFilePath);
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

            for (CSVRecord record : csvParser) {

                WeatherDTO weather = new WeatherDTO();
                weather.setDate(record.get("일시"));
                weather.setAverageTemperature(record.get("평균기온(℃)"));
                weather.setMaxTemperature(record.get("최고기온(℃)"));
                weather.setMaxTemperatureTime(record.get("최고기온시각"));
                weather.setMinTemperature(record.get("최저기온(℃)"));
                weather.setMinTemperatureTime(record.get("최저기온시각"));
                weather.setTemperatireRange(record.get("일교차"));
                weather.setPrecipitation(record.get("강수량(mm)"));

                weathers.add(weather);
            }
            reader.close();
            csvParser.close();


            
            Messenger messenger = weatherService.getWeather(weathers);
            return messenger;
        } catch (Exception e) {
            Messenger messenger = new Messenger();
            messenger.setCode(500);
            messenger.setMessage("날씨 데이터 조회 중 오류가 발생했습니다.");
            return messenger;
        }
    }

}
