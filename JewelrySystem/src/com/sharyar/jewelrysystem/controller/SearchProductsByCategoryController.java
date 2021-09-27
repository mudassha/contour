package com.sharyar.jewelrysystem.controller;

import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

import com.sharyar.jewelrysystem.service.product.SearchProductService;


public class SearchProductsByCategoryController{

	public void search(ProductDTO p) {
		SearchProductService s = new SearchProductService();
		s.searchByCategory(p);
	}
}
