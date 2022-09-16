package edu.scau.ngpos.controller;

import edu.scau.ngpos.core.domain.AjaxResult;
import edu.scau.ngpos.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;
    @GetMapping("/{categoryId}")
    public AjaxResult getById(@PathVariable("categoryId") Long categoryId) {
        return AjaxResult.success(categoryService.getCategoryById(categoryId));
    }

    @GetMapping("/listAll")
    public AjaxResult listAllCategory(){
        return AjaxResult.success(categoryService.listAllCategory());
    }
}