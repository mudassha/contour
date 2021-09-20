package com.sharyar.jewelrysystem.controller;

import java.util.*;
import com.sharyar.jewelrysystem.db.product.dao.ProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class DisplayProductDetailsController {
	
	private int id;
	private String name;
	
	
	public DisplayProductDetailsController(int id, String name) {
		
		this.id = id;
		this.name = name;
		
	}
	
	public void displayProductController() {
		
		ProductDAO pdao = new ProductDAO();
		ArrayList<ProductDTO> p = new ArrayList<ProductDTO>();
		p = pdao.get();
		
		for(ProductDTO pobj : p)
		{
			
			if(pobj.getId() == this.id  &&  pobj.getName().equals(this.name))
			{
				System.out.println("\nProduct ID : " + pobj.getId() + "\nProduct Name : " + pobj.getName() + "\nProduct Price : " + pobj.getPrice() + "\nProduct Category : " + pobj.getCategory().toString() + "\nProduct Status : " + pobj.getStatus().toString() + "\nProduct Description : " + pobj.getDescription());
			}
			
		}
		
	}
	
	
}
