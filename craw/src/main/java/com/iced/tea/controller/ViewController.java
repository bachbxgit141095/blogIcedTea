package com.iced.tea.controller;

import com.iced.tea.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/tesssss",method = RequestMethod.GET)
    public String viewHome(){
        try{
            categoryService.getAllCategory();
        }catch (Exception e){

        }
        return "index";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String viewHomeTest(){
        return "index";
    }
}
