package com.sharyar.jewelrysystem.service.product;

import java.util.ArrayList;


import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class DisplayProductDetailsService {
	
	DbProductDAO dbdao = new DbProductDAO();
	ArrayList<ProductDTO> a = dbdao.get();

	public void displayProductDetailsService(int id, String name) {
		
		
		for(ProductDTO pobj : a)
		{
			
			if(pobj.getId() == id  &&  pobj.getName().equals(name))
			{
				System.out.println("\nProduct ID : " + pobj.getId() + "\nProduct Name : " + pobj.getName() + "\nProduct Price : " + pobj.getPrice() + "\nProduct Category : " + pobj.getCategory().toString() + "\nProduct Status : " + pobj.getStatus().toString() + "\nProduct Description : " + pobj.getDescription());
			}
			
		}
	}
	
	public void displayAllProductsService() {
		
		
		for(ProductDTO all : a)
		{
			System.out.println("\nProduct ID : "+all.getId() + " | Product Name : " + all.getName() + " | Product Price : " + all.getPrice());
		
		}
	}
}
