package com.sharyar.jewelrysystem.service.product;

import com.sharyar.jewelrysystem.db.product.dao.ProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class AddProductService {
	
	private ProductDTO product;
	
	public AddProductService(ProductDTO product) {
		this.product = product;
	}
		
	public void addProductService() {
		ProductDAO pdao = new ProductDAO();
		pdao.add(product);
	}
}
