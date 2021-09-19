package com.sharyar.jewelrysystem.controller;

import com.sharyar.jewelrysystem.db.product.dao.ProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class AddProductController {

	//TODO should implement through service later on 
	
	public void addProduct(ProductDTO p) {
		ProductDAO pdao = new ProductDAO();
		pdao.add(p);
	}
	
}
