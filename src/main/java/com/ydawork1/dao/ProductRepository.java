package com.ydawork1.dao;

import com.ydawork1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<List<Product>> getAllByCategory_id(Long id);
}
