package edu.scau.ngpos.controller;

import edu.scau.ngpos.domain.Category;
import edu.scau.ngpos.domain.ProductDescription;
import edu.scau.ngpos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/{productSn}")
    public ProductDescription getBySn(@PathVariable("productSn") String productSn){
        return productService.getProductByProductSn(productSn);
    }

    @GetMapping("/listAll")
    public List<ProductDescription> listAllProduct(){
        return productService.listAllProduct();
    }
}
