package edu.scau.ngpos.mapper;

import edu.scau.ngpos.domain.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class CategoryCatalog {
    private HashMap<Long, Category> categoryHashMap = new HashMap<>();

    public CategoryCatalog(){
        Category category1 = new Category(1L,"文具");
        Category category2 = new Category(2L,"日用品");
        categoryHashMap.put(category1.getCategoryId(), category1);
        categoryHashMap.put(category2.getCategoryId(), category2);
    }

    /**
     * 根据id得到category
     * @param categoryId
     * @return category对象
     */
    public Category getCategoryById(Long categoryId){
        return categoryHashMap.get(categoryId);
    }

    /**
     * 列出所有category
     * @return category集合
     */
    public List<Category> listAllCategory(){
        List<Category> categoryList = new ArrayList<>();
        categoryList.addAll(categoryHashMap.values());
        return categoryList;
    }
}
