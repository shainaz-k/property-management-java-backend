package com.property.management.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CalculatorDTO {
    private Double number1;
    private Double number2;
    private Double number3;

    @JsonProperty("number4")
    private Double number4;
}
