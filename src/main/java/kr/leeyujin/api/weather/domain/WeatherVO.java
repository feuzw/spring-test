package kr.leeyujin.api.weather.domain;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class WeatherVO {
    private String date;
    private String averageTemperature;
    private String maxTemperature;
    private String maxTemperatureTime;
    private String minTemperature;
    private String minTemperatureTime;
    private String temperatireRange;
    private String precipitation;
}
