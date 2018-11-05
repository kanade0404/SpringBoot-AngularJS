package com.example.service;

import com.example.model.Category;
import com.example.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category findCategory(Long id) { return categoryRepository.findOne(id); }
    public List<Category> findAllCategories() { return categoryRepository.findAll(); }
    public Category save(Category category) { return categoryRepository.save(category); }
    public void delete(Long id) { categoryRepository.delete(id); }
}
