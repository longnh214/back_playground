package com.example.springstress.controller;

import com.example.springstress.dto.ProductDto;
import com.example.springstress.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) {
        ProductDto product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> searchProducts(
            @RequestParam(required = false) String category,
            @RequestParam(required = false) String name) {
        List<ProductDto> products = productService.searchProducts(category, name);
        return ResponseEntity.ok(products);
    }
}