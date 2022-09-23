package edu.scau.ngpos.test.service;

import edu.scau.ngpos.domain.Category;
import edu.scau.ngpos.service.ICategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ICategoryServiceTest {

    @Autowired
    private ICategoryService iCategoryService;

    @Test
    void getCategoryById() {
        Category category = iCategoryService.getCategoryById(1L);
        Assertions.assertEquals(1L, category.getCategoryId(), "ID查找category失败");
    }

    @Test
    void listAllCategory() {
        Assertions.assertTrue(iCategoryService.listAllCategory().size() == 2, "listAllCategory失败");
    }
}