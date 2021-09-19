package com.sharyar.jewelrysystem.controller;

import java.util.ArrayList;

import com.sharyar.jewelrysystem.db.product.dao.ProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class DisplayAllProductController {
	
	
	//TODO Make a service to send request and display all products but not all their details
	
	public void displayAllProducts() {
		
		ProductDAO p = new ProductDAO();
		ArrayList<ProductDTO> a = p.get();
		
		for(ProductDTO all : a)
		{
			System.out.println("Product ID : "+all.getId() + " | Product Name : " + all.getName() + " | Product Price : " + all.getPrice());
		}
	}
}
