package com.sharyar.jewelrysystem.controller;


import com.sharyar.jewelrysystem.service.product.DisplayProductDetailsService;

public class DisplayProductDetailsController {
	
	
	public void displayProductController(int id, String name) {
		
		DisplayProductDetailsService dis = new DisplayProductDetailsService();
		dis.displayProductDetailsService(id,name);
	}
	
	
}
