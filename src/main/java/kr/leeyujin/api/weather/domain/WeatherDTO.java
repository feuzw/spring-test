package kr.leeyujin.api.weather.domain;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDTO {
    private String date;
    private String averageTemperature;
    private String maxTemperature;
    private String maxTemperatureTime;
    private String minTemperature;
    private String minTemperatureTime;
    private String temperatireRange;
    private String precipitation;
}
