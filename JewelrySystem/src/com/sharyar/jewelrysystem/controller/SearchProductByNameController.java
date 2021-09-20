package com.sharyar.jewelrysystem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sharyar.jewelrysystem.db.admin.dto.AdminDTO;
import com.sharyar.jewelrysystem.db.product.dao.ProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class SearchProductByNameController {
	
	
	
	public void searchAndDisplay(String name) {
		ProductDAO pdao = new ProductDAO();
		ArrayList<ProductDTO> li = pdao.get();
		List<String> namelist = new ArrayList<String>();
		for(ProductDTO b : li)
		{
			namelist.add(b.getName());
		}
		
		
		
		
		List<String> l2 = namelist.stream().filter(s->s.startsWith(name)).collect(Collectors.toList());
		System.out.println("\n" + l2);
		
		
	}
	
}
