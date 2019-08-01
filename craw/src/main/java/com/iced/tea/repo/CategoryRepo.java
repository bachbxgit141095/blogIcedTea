package com.iced.tea.repo;

import com.iced.tea.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CategoryRepo extends JpaRepository<Categories,Long>,CategoryRepoCustom {
}
