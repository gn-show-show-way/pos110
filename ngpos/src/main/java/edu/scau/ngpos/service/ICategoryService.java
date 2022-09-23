package edu.scau.ngpos.service;

import edu.scau.ngpos.domain.Category;

import java.util.List;

public interface ICategoryService {
    Category getCategoryById(Long categoryId);
    List<Category> listAllCategory();
}
