package com.iced.tea.api;

import com.iced.tea.config.HttpResponseException;
import com.iced.tea.dto.CategoriesDTO;
import com.iced.tea.model.Categories;
import com.iced.tea.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {

    private static final Logger logger = LoggerFactory.getLogger(APIController.class);

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/getCategories", method = RequestMethod.GET)
    public List<Categories> getAllCategories() {
        List<Categories> categories = new ArrayList<>();
        try {
            categories = categoryService.getAllCategory();
        } catch (Exception e) {
            logger.error("ERROR :" + e.getMessage(), e);
        }
        return categories;
    }

    @RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public boolean saveCategory() {
        try {
            CategoriesDTO categoriesDTO = new CategoriesDTO();
            categoriesDTO.setIdCategory(100001L);
            categoriesDTO.setName("PY THON");
            categoriesDTO.setIdParent(1000001L);
            categoriesDTO.setUpdatedBy(1000001L);
            categoryService.saveCategory(categoriesDTO);
            throw new HttpResponseException("Exception");
        } catch (Exception e) {
            logger.error("ERROR :" + e.getMessage(), e);
            throw new ResponseStatusException(
                HttpStatus.OK, "Foo Not Found", e);
        }
//        return true;
    }
}
