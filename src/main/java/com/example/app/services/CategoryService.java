package com.example.app.services;

import com.example.app.entities.Category;
import com.example.app.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryService;

    public List<Category> findAll() {
        return categoryService.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = categoryService.findById(id);
        return obj.get();
    }
}
