package com.sharyar.jewelrysystem.controller;

import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class EditProductController {

	public void updateProduct(ProductDTO t) {
		
		DbProductDAO pdao = new DbProductDAO();
		pdao.update(t);
		
	}
}
