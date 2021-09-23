package com.sharyar.jewelrysystem.service.product;

import java.util.ArrayList;

import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class DisplayAllProductService {

	public void displayAllProductsService() {
		DbProductDAO p = new DbProductDAO();
		ArrayList<ProductDTO> a = p.get();
		
		for(ProductDTO all : a)
		{
			System.out.println("\nProduct ID : "+all.getId() + " | Product Name : " + all.getName() + " | Product Price : " + all.getPrice());
		
		}
	}
}
