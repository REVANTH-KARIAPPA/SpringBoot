package com.example.demo.entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
   private Integer productId;
   private String productName;
   public Product() {
	
}
   
public Product(Integer productId, String productName) {
	super();
	this.productId = productId;
	this.productName = productName;
}

public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
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
	return "Product [productId=" + productId + ", productName=" + productName + "]";
}

   
}
