package edu.scau.ngpos.test.service;

import edu.scau.ngpos.domain.ProductDescription;
import edu.scau.ngpos.service.IProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IProductServiceTest {
    @Autowired
    private IProductService productService;

    @Test
    void getProductByProductSn() {
        ProductDescription product = productService.getProductByProductSn("1001");
        Assertions.assertEquals(1L, product.getProductId(), "Sn查找product失败");
    }

    @Test
    void listAllProduct() {
        Assertions.assertTrue(productService.listAllProduct().size() == 6, "listAllProduct失败");
    }
}