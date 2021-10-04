package com.sharyar.jewelrysystem.controller;

import java.sql.SQLException;
import java.util.List;

import com.sharyar.jewelrysystem.common.PrintDetails;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

import com.sharyar.jewelrysystem.service.product.SearchProductService;


public class SearchProductsByCategoryController{

	public void search(ProductDTO p) throws SQLException {
		SearchProductService s = new SearchProductService();
		List<ProductDTO> products = s.searchByCategory(p);
		PrintDetails display = new PrintDetails();
		display.print(products);
	}
}
