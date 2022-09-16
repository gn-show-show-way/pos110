package edu.scau.ngpos.controller;

import edu.scau.ngpos.domain.Category;
import edu.scau.ngpos.domain.ProductDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("productDescription")
public class ProductController {
    @Autowired
    private ProductDescription productDescription;
    @Autowired
    private Category category;

    @GetMapping("/{productId}")
    public ProductDescription getById(@PathVariable("productId") Long productId){
        productDescription.setProductId(productId);
        productDescription.setProductName("文具");
        productDescription.setProductSn("None");
        productDescription.setPrice(BigDecimal.valueOf(0));
        productDescription.setCategory(category);
        category.setCategoryId(productId);
        category.setCategoryName("文具");

        return productDescription;
    }
}
