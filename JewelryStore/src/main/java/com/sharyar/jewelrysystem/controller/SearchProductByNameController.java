package com.sharyar.jewelrysystem.controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.sharyar.jewelrysystem.common.PrintDetails;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.service.product.SearchProductService;
import com.sharyar.jewelrysystem.util.Searchable;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SearchProductByNameController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	public void search(ProductDTO p) throws SQLException {
		SearchProductService s = new SearchProductService();
		List<ProductDTO> products = s.searchByName(p);
		PrintDetails display = new PrintDetails();
		display.print(products);
		
		
	}
	
}
