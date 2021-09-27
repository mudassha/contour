package com.sharyar.jewelrysystem.controller;


import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.service.product.SearchProductService;
import com.sharyar.jewelrysystem.util.Searchable;


public class SearchProductByNameController{
	
	

	public void search(ProductDTO p) {
		SearchProductService s = new SearchProductService();
		s.searchByName(p);
		
		
		
	}
	
}
