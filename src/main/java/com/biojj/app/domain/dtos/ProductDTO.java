package com.biojj.app.domain.dtos;

import com.biojj.app.domain.Category;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private Category category;
}
