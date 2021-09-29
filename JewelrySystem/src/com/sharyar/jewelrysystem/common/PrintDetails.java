package com.sharyar.jewelrysystem.common;

import java.util.List;

import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class PrintDetails {

		public void print(List<ProductDTO> catpro) {
			
			for(ProductDTO p:catpro)
			{
				System.out.println("\nProduct ID : " + p.getId() + "\nProduct Name : " + p.getName() + "\nProduct Price : " + p.getPrice() + "\nProduct Category : " + p.getCategory().toString() + "\nProduct Status : " + p.getStatus().toString() + "\nProduct Description : " + p.getDescription());
			}
			
		}
}
