package com.sharyar.jewelrysystem.controller;

import java.util.ArrayList;

import com.sharyar.jewelrysystem.db.product.dao.ProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.service.product.DisplayAllProductService;

public class DisplayAllProductController {
	
	
	//TODO Make a service to send request and display all products but not all their details
	
	public void displayAllProducts() {
		
		DisplayAllProductService all = new DisplayAllProductService();
		all.displayAllProductsService();
	}
}
