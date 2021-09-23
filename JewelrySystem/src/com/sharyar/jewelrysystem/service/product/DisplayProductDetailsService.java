package com.sharyar.jewelrysystem.service.product;

import java.util.ArrayList;

import com.sharyar.jewelrysystem.db.product.dao.ProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class DisplayProductDetailsService {
	
	private int id;
	private String name;
	
	public DisplayProductDetailsService(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void displayProductDetailsService() {
		ProductDAO pdao = new ProductDAO();
		ArrayList<ProductDTO> p = new ArrayList<ProductDTO>();
		p = pdao.get();
		
		for(ProductDTO pobj : p)
		{
			
//			if(pobj.getId() == this.id  &&  pobj.getName().equals(this.name))
//			{
//				System.out.println("\nProduct ID : " + pobj.getId() + "\nProduct Name : " + pobj.getName() + "\nProduct Price : " + pobj.getPrice() + "\nProduct Category : " + pobj.getCategory().toString() + "\nProduct Status : " + pobj.getStatus().toString() + "\nProduct Description : " + pobj.getDescription());
//			}
			
		}
	}
}
