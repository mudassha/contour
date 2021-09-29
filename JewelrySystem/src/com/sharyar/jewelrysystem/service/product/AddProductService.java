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
		try {
			
			if(product.getName() == null || product.getCategory().toString()==null || product.getStatus().toString() == null || product.getDescription() == null) {
				throw new IllegalArgumentException("Cannot add product with null values");
			}
			else
			{
				pdao.add(product);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
