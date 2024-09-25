package com.learningSpringBoot.ProductsAPI.Repository;

import com.learningSpringBoot.ProductsAPI.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
