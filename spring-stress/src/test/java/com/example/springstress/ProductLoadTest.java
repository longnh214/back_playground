package com.example.springstress;


import com.example.springstress.entity.Product;
import com.example.springstress.repository.ProductRepository;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductLoadTest {

    @Autowired private ProductRepository productRepository;

    @Test
    @DisplayName("10만개 데이터 저장")
    public void insertLargeNumberOfProducts() {
        List<String> categories =
                List.of("Electronics", "Books", "Clothing", "Home & Kitchen", "Toys & Games");
        int numberOfProducts = 100000;

        for (int i = 1; i <= numberOfProducts; i++) {
            Product product =
                    Product.builder()
                            .name("Product " + i)
                            .price(Math.random() * 100)
                            .description("Description for product " + i)
                            .category(categories.get(i % categories.size()))
                            .sku("sku " + i)
                            .stock((int) (Math.random() * 10000))
                            .build();
            productRepository.save(product);

            //            if (i % 1000 == 0) {
            //                System.out.println(i + " products saved...");
            //            }
        }

        //        System.out.println("10만 개의 Product가 성공적으로 저장되었습니다!");
    }
}
