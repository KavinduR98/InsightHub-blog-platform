package com.ushan.blog_backend.services.impl;

import com.ushan.blog_backend.domain.entities.Category;
import com.ushan.blog_backend.repository.CategoryRepository;
import com.ushan.blog_backend.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount();
    }
}
