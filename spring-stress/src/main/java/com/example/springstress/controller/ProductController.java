package com.example.springstress.controller;


import com.example.springstress.dto.ProductDto;
import com.example.springstress.service.ProductService;
import java.util.List;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer size) {
        Pageable pageable = null;
        if (!Objects.isNull(page) && !Objects.isNull(size)) {
            pageable = PageRequest.of(page, size);
        }

        List<ProductDto> products = productService.searchProducts(category, name, pageable);
        return ResponseEntity.ok(products);
    }
}
