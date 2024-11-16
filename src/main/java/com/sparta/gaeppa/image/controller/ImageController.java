package com.sparta.gaeppa.image.controller;

import static com.sparta.gaeppa.global.util.ApiResponseUtil.success;

import com.sparta.gaeppa.global.storage.StorageService;
import com.sparta.gaeppa.global.util.ApiResponseUtil.ApiResult;
import com.sparta.gaeppa.image.dto.ImageResponseDto;
import com.sparta.gaeppa.image.service.ProductImageService;
import com.sparta.gaeppa.image.service.ReviewImageService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/v1/images")
@RequiredArgsConstructor
public class ImageController {

    private final StorageService storageService;
    private final ProductImageService productImageService;
    private final ReviewImageService reviewImageService;

    @GetMapping("/product-images/{imageId}")
    public ResponseEntity<Resource> getProductImagesByProductId(@PathVariable UUID imageId) {

        Resource image = productImageService.getProductImage(imageId);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "image/jpeg");

        return new ResponseEntity<>(image, headers, HttpStatus.OK);

    }

    @GetMapping("/review-images/{imageId}")
    public ResponseEntity<Resource> getReviewImagesByProductId(@PathVariable UUID imageId) {

        Resource image = reviewImageService.getReviewImage(imageId);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, );

        return new ResponseEntity<>(image, headers, HttpStatus.OK);
    }

    @PostMapping("/product-images")
    public ResponseEntity<ApiResult<ImageResponseDto>> handleProductImageUpload(
            @RequestParam("productid") String productId,
            @RequestParam("file") MultipartFile file) {

        ImageResponseDto responseDto = productImageService.uploadProductImage(productId, file);

        return new ResponseEntity<>(success(responseDto), HttpStatus.CREATED);
    }


    @PostMapping("/review-images")
    public ResponseEntity<ApiResult<ImageResponseDto>> handleReviewImageUpload(
            @RequestParam("reviewid") String reviewid,
            @RequestParam("file") MultipartFile file) {

        ImageResponseDto responseDto = reviewImageService.uploadReviewImage(reviewid, file);

        return new ResponseEntity<>(success(responseDto), HttpStatus.CREATED);
    }
}