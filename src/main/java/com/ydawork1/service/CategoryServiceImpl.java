package com.ydawork1.service;

import com.ydawork1.dao.CategoryRepository;
import com.ydawork1.model.Category;
import com.ydawork1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Optional<List<Category>> getAll() {
        return Optional.of(categoryRepository.findAll());
    }

    @Override
    public Optional<List<Category>> getAllWithProducts() {
        return Optional.of(categoryRepository.findAll());
    }

    @Override
    public Optional<Category> create(Category category) {
        return Optional.of(categoryRepository.save(category));
    }

    @Override
    public Optional<Category> getById(Long id) {
        return categoryRepository.getById(id);
    }

    @Override
    public Optional<Category> update(Category category) {
        return Optional.of(categoryRepository.save(category));
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Optional<Category> getByIdWithProducts(Long id) {
        return categoryRepository.getById(id);
    }

    @Override
    public Optional<Category> increaseProductsPriceBy10P(Category category) {
        List<Product> products = category.getProducts().stream()
                .peek(p -> p.setPrice(p.getPrice() * 1.1))
                .collect(toList());

        category.setProducts(products);
        categoryRepository.save(category);
        return categoryRepository.getById(category.getId());
    }
}
