package kr.leeyujin.api.weather.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.weather.domain.WeatherDTO;
import kr.leeyujin.api.weather.repository.WeatherRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherRepository weatherRepository;

    public Messenger getWeather(List<WeatherDTO> weathers) {
        Messenger messenger = weatherRepository.saveWeather(weathers);
        
        return messenger;
    }
}
