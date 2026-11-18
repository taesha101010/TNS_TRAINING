package com.prac.question4;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable long id,
            @RequestBody UpdateProductRequest request) {
            Optional<Product> updatedProduct = productService.update(id, request);
            if (updatedProduct.isPresent){
                return ResponseEntity.ok(updatedProduct.get())
            }
        return ResponseEntity.notFound().build();
    }
}
