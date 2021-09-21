package com.sharyar.jewelrysystem.controller;


import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.service.product.AddProductService;

public class AddProductController {

	//TODO should implement through service later on 
	
	public void addProduct(ProductDTO p) {
		AddProductService add = new AddProductService(p);
		add.addProductService();
	}
	
}
