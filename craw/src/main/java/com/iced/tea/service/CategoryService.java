package com.iced.tea.service;

import com.iced.tea.config.HttpResponseException;
import com.iced.tea.dto.CategoriesDTO;
import com.iced.tea.model.Categories;

import java.util.List;

public interface CategoryService {
    List<Categories> getAllCategory() throws Exception;

    void saveCategory(CategoriesDTO categoriesDTO) throws HttpResponseException;
}
