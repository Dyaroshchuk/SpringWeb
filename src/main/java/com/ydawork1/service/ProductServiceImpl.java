package com.ydawork1.service;

import com.ydawork1.dao.ProductRepository;
import com.ydawork1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Optional<List<Product>> getAllById(Long id) {
        return productRepository.getAllByCategory_id(id);
    }
}
