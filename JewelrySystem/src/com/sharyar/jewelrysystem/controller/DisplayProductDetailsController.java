package com.sharyar.jewelrysystem.controller;

import java.util.*;
import com.sharyar.jewelrysystem.db.product.dao.ProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.service.product.DisplayProductDetailsService;

public class DisplayProductDetailsController {
	
	
	
	
	
	
	public void displayProductController(int id, String name) {
		
		DisplayProductDetailsService dis = new DisplayProductDetailsService(id, name);
		dis.displayProductDetailsService();
	}
	
	
}
