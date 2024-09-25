package com.learningSpringBoot.ProductsAPI.Service;

import com.learningSpringBoot.ProductsAPI.Model.Product;
import com.learningSpringBoot.ProductsAPI.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service // Marks this class as a service component
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    public Product updateProduct(int id, Product updatedProduct) {
        if (!productRepository.existsById(id)) {
            throw new IllegalArgumentException("Product not found");
        }
        updatedProduct.setId(id);
        return productRepository.save(updatedProduct);
    }

    public void deleteProduct(int id) {
        if (!productRepository.existsById(id)) {
            throw new IllegalArgumentException("Product not found");
        }
        productRepository.deleteById(id);
    }
}