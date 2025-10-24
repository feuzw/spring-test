package kr.leeyujin.api.weather.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.weather.domain.WeatherDTO;
import kr.leeyujin.api.weather.repository.WeatherRepository;
import lombok.RequiredArgsConstructor;

public interface WeatherService {
    Messenger save(WeatherDTO weather);
    Messenger saveAll(List<WeatherDTO> weathers);
    Messenger update(WeatherDTO weather);
    Messenger delete(String id);
    Messenger findById(String id);
    Messenger findAll();
}
