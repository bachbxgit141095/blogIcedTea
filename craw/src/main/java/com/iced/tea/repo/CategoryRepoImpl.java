package com.iced.tea.repo;

import com.iced.tea.model.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CategoryRepoImpl implements CategoryRepoCustom {

    @Autowired
    EntityManager em;

    @Override
    public List<Categories> getAllCategory() throws Exception {
        return null;
    }
}
