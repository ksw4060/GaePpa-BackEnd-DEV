package com.sparta.gaeppa.product.dto.productCategory;

import com.sparta.gaeppa.product.entity.ProductCategory;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductCategoryRequestDto {
    @NotBlank(message = "Product Category Name is required")
    private String categoryName;

    public ProductCategory toEntity() {
        return ProductCategory.builder()
                .name(categoryName)
                .build();
    }
}