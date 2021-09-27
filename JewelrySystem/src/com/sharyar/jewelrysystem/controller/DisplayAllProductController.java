package com.sharyar.jewelrysystem.controller;


import com.sharyar.jewelrysystem.service.product.DisplayProductDetailsService;

public class DisplayAllProductController {
	
	
	//TODO Make a service to send request and display all products but not all their details
	
	public void displayAllProducts() {
		
		DisplayProductDetailsService all = new DisplayProductDetailsService();
		all.displayAllProductsService();
	}
}
