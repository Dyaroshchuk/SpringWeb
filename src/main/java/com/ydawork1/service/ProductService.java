package com.ydawork1.service;

import com.ydawork1.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<List<Product>> getAllById(Long id);
}
