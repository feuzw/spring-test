package kr.leeyujin.api.product.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductVO {
    private String id;
    private String name;
    private String description;
    private String brand;
    private String category;
    private String price;
    private String currency;
    private String stock;
    private String ean;
    private String color;
    private String size;
    private String availability;
    private String internalId;
}
