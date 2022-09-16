package edu.scau.ngpos.service.impl;

import edu.scau.ngpos.domain.ProductDescription;
import edu.scau.ngpos.mapper.ProductCatalog;
import edu.scau.ngpos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductCatalog productCatalog;
    /**
     * 根据SN找产品
     * @param productSn 产品编号
     * @return 产品对象
     */
    public ProductDescription getProductByProductSn(String productSn){
        return productCatalog.getProductBySn(productSn);
    }

    /**
     * 列出所有产品
     * @return 产品集合
     */
    public List<ProductDescription> listAllProduct(){
        return productCatalog.listAllProduct();
    }
}
