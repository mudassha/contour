package com.sharyar.jewelrysystem.controller;


import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.service.product.RemoveProductService;

public class RemoveProductController {

	//TODO should implement through a service later on
	
	public void removeProduct(ProductDTO p) {
		
		RemoveProductService r = new RemoveProductService();
		r.remove(p);
		
		
	}
}
