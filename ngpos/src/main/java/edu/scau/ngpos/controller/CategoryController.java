package edu.scau.ngpos.controller;

import edu.scau.ngpos.core.domain.AjaxResult;
import edu.scau.ngpos.service.ICategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation("根据id查询category")
    public AjaxResult getById(@PathVariable("categoryId") Long categoryId) {
        return AjaxResult.success(categoryService.getCategoryById(categoryId));
    }

    @GetMapping("/listAll")
    @ApiOperation("查询所有category")
    public AjaxResult listAllCategory(){
        return AjaxResult.success(categoryService.listAllCategory());
    }
}