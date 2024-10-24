package com.biojj.app.domain.dtos;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private Long categoryId;
}