package com.ecommerce.product.dtos;

import lombok.*;

import java.math.BigDecimal;

@Getter@Setter@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private String category;
    private String imageUrl;
    private Boolean active;

}
