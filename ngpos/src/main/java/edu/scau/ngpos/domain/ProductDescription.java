package edu.scau.ngpos.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;

@Component
public class ProductDescription implements Serializable {
    private Long productId;
    private String productName;
    private Category category;
    private String productSn;
    private BigDecimal price;

    public ProductDescription(){}

    public ProductDescription(Long productId,String productSn, Category category, String productName, BigDecimal price) {
        this.productId = productId;
        this.productSn = productSn;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public String getProductSn(){
        return productSn;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductDescription{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category=" + category +
                ", productSn='" + productSn + '\'' +
                ", price=" + price +
                '}';
    }
}
