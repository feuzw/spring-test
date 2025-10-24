package kr.leeyujin.api.weather.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.weather.domain.WeatherDTO;
import kr.leeyujin.api.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;

@Repository
public class WeatherRepository {
    public Messenger save(WeatherDTO weather) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public Messenger saveAll(List<WeatherDTO> weathers) {
        System.out.println("\n===== 레포지토리: 날씨 데이터 출력 시작 =====\n");

        for (int i = 0; i < weathers.size(); i++) {
            WeatherDTO weather = weathers.get(i);
            System.out.println("===== 날씨 " + (i + 1) + " =====");
            System.out.println("일시: " + weather.getDate());
            System.out.println("평균기온: " + weather.getAverageTemperature());
            System.out.println("최고기온: " + weather.getMaxTemperature());
        }
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("날씨 데이터 출력 성공");
        return messenger;
    }

    public void save(List<WeatherDTO> weather) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public void update(WeatherDTO weather) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public void delete(WeatherDTO weather) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public void findById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public void findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}