package com.ydawork1.dao;

import com.ydawork1.model.Category;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @EntityGraph("Category.products")
    Optional<Category> getById(Long id);

    @EntityGraph("Category.products")
    List<Category> findAll();
}
