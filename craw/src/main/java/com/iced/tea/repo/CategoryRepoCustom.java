package com.iced.tea.repo;

import com.iced.tea.model.Categories;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CategoryRepoCustom {
    List<Categories> getAllCategory() throws Exception;
}
