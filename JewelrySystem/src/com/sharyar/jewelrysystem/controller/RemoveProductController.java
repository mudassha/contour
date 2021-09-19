package com.sharyar.jewelrysystem.controller;

import com.sharyar.jewelrysystem.db.product.dao.ProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class RemoveProductController {

	//TODO should implement through a service later on
	
	public void removeProduct(ProductDTO p) {
		
		ProductDAO pdao = new ProductDAO();
		pdao.delete(p);
		
	}
}
