package com.iced.tea.service;

import com.iced.tea.config.HttpResponseException;
import com.iced.tea.dto.CategoriesDTO;
import com.iced.tea.model.Categories;
import com.iced.tea.repo.CategoryRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo categoryRepo;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<Categories> getAllCategory() throws Exception {
        return categoryRepo.findAll();
    }

    @Override
    public void saveCategory(CategoriesDTO categoriesDTO) throws HttpResponseException {
        categoryRepo.save(modelMapper.map(categoriesDTO,Categories.class));
    }
}
