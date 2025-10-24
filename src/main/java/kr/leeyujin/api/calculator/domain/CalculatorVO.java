package kr.leeyujin.api.calculator.domain;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorVO {
    private int num1;
    private int num2;
    private String operator;
}
