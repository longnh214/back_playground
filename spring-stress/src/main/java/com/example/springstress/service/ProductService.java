package com.example.springstress.service;


import com.example.springstress.dto.ProductDto;
import com.example.springstress.entity.Product;
import com.example.springstress.repository.ProductRepository;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public ProductDto getProductById(Long id) {
        Product product =
                productRepository
                        .findById(id)
                        .orElseThrow(
                                () ->
                                        new IllegalArgumentException(
                                                "Product not found with id: " + id));
        return convertToDto(product);
    }

    @Cacheable(cacheNames = "ehCache", cacheManager = "ehCacheCacheManager")
//    @Cacheable(cacheNames = "redisCache", cacheManager = "redisCacheManager")
    public List<ProductDto> searchProducts(String category, String name, Pageable pageable) {
        List<Product> products;

        if (!Objects.isNull(pageable)) {
            products =
                    productRepository
                            .findByCategoryAndNameContainingIgnoreCase(category, name, pageable)
                            .toList();
            //            products = productRepository.searchProductsByCategoryAndName(category,
            // name, pageable).toList();
        } else if (category != null && name != null) {
            products = productRepository.findByCategoryAndNameContainingIgnoreCase(category, name);
        } else if (category != null) {
            products = productRepository.findByCategory(category);
        } else if (name != null) {
            products = productRepository.findByNameContainingIgnoreCase(name);
        } else {
            products = productRepository.findAll();
        }

        return products.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private ProductDto convertToDto(Product product) {
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getCategory(),
                product.getPrice(),
                product.getDescription());
    }
}
