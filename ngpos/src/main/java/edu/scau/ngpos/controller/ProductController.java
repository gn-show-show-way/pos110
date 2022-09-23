package edu.scau.ngpos.controller;

import edu.scau.ngpos.core.domain.AjaxResult;
import edu.scau.ngpos.domain.ProductDescription;
import edu.scau.ngpos.service.IProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/{productSn}")
    @ApiOperation("根据Sn查询product")
    public AjaxResult getBySn(@PathVariable("productSn") String productSn){
        return AjaxResult.success(productService.getProductByProductSn(productSn));
    }

    @GetMapping("/listAll")
    @ApiOperation("查询所有product")
    public AjaxResult listAllProduct(){
        return AjaxResult.success(productService.listAllProduct());
    }
}
