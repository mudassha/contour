package com.sharyar.jewelrysystem.service.product;

import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class AddProductService {
	
	private ProductDTO product;
	
	public AddProductService(ProductDTO product) {
		this.product = product;
	}
		
	public void addProductService() {
		DbProductDAO pdao = new DbProductDAO();
		pdao.add(product);
	}
}
