package com.example.springstress.repository;

import com.example.springstress.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);

    List<Product> findByNameContainingIgnoreCase(String name);

    List<Product> findByCategoryAndNameContainingIgnoreCase(String category, String name);
    Page<Product> findByCategoryAndNameContainingIgnoreCase(String category, String name, Pageable pageable);

    @Query(nativeQuery = true, value = """
            SELECT *
            FROM products
            WHERE category = :category
            and MATCH(name) AGAINST(:name IN BOOLEAN MODE);
            """,
            countQuery = """
                SELECT COUNT(*)
                FROM products
                WHERE category = :category
                and MATCH(name) AGAINST(:name IN BOOLEAN MODE);
    """)
    Page<Product> searchProductsByCategoryAndName(String category, String name, Pageable pageable);
}