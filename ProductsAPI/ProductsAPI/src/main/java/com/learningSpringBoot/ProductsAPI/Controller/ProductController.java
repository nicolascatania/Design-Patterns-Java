package com.learningSpringBoot.ProductsAPI.Controller;

import com.learningSpringBoot.ProductsAPI.Model.Product;
import com.learningSpringBoot.ProductsAPI.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productService.createProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        return productService.getProductById(id)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/updateById/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        try {
            Product product = productService.updateProduct(id, updatedProduct);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
        try {
            productService.deleteProduct(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}