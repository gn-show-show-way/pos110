package edu.scau.ngpos.service;

import edu.scau.ngpos.domain.ProductDescription;

import java.util.List;

public interface IProductService {
    /**
     * 根据SN找产品
     * @param productSn 产品编号
     * @return 产品对象
     */
    ProductDescription getProductByProductSn(String productSn);

    /**
     * 列出所有产品
     * @return 产品集合
     */
    List<ProductDescription> listAllProduct();
}