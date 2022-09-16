package edu.scau.ngpos.service.impl;

import edu.scau.ngpos.domain.Category;
import edu.scau.ngpos.mapper.CategoryCatalog;
import edu.scau.ngpos.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryCatalog categoryCatalog;

    /**
     * 根据编号找类别
     * @param categoryId 类别编号
     * @return 类别
     */
    @Override
    public Category getCategoryById(Long categoryId) {
        return categoryCatalog.getCategoryById(categoryId);
    }

    /**
     * 返回全部类别
     * @return 类别数组
     */
    public List<Category> listAllCategory(){
        return categoryCatalog.listAllCategory();
    }
}
