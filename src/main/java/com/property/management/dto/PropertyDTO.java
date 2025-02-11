package com.property.management.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyDTO {
    private Long id;
    private String title;
    private String description;
    private String price;
    private String address;
    private Long userId;
}
