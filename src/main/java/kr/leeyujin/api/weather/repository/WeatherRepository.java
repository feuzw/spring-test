package kr.leeyujin.api.weather.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.weather.domain.WeatherDTO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class WeatherRepository {
    public Messenger saveWeather(List<WeatherDTO> weathers) {
        System.out.println("\n===== 레포지토리: 날씨 데이터 출력 시작 =====\n");

        for (int i = 0; i < weathers.size(); i++) {
            WeatherDTO weather = weathers.get(i);
            System.out.println("===== 날씨 " + (i + 1) + " =====");
            System.out.println("일시: " + weather.getDate());
            System.out.println("평균기온: " + weather.getAverageTemperature());
            System.out.println("최고기온: " + weather.getMaxTemperature());
            System.out.println("최고기온시각: " + weather.getMaxTemperatureTime());
            System.out.println("최저기온: " + weather.getMinTemperature());
            System.out.println("최저기온시각: " + weather.getMinTemperatureTime());
            System.out.println("일교차: " + weather.getTemperatireRange());
            System.out.println("강수량: " + weather.getPrecipitation());
            System.out.println("====================\n");
        }

        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("날씨 데이터 출력 성공");
        return messenger;
    }
}
