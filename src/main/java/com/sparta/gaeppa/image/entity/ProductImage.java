package com.sparta.gaeppa.image.entity;

import com.sparta.gaeppa.global.base.BaseEntity;
import com.sparta.gaeppa.image.mime.MimeType;
import com.sparta.gaeppa.product.entity.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "p_product_images")
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class ProductImage extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_image_id")
    private UUID id;

    @Column(name = "product_image_name")
    private String originalName;

    @Column(name = "product_image_path")
    private String fileName;

    @Enumerated(EnumType.STRING)
    private MimeType mimeType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Builder
    private ProductImage(String originalName, String fileName, Product product, MimeType mimeType) {
        this.originalName = originalName;
        this.fileName = fileName;
        this.product = product;
        this.mimeType = mimeType;
    }
}