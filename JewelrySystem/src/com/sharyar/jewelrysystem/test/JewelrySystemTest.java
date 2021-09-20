package com.sharyar.jewelrysystem.test;

import com.sharyar.jewelrysystem.controller.AddProductController;
import com.sharyar.jewelrysystem.controller.DisplayAllProductController;
import com.sharyar.jewelrysystem.controller.DisplayProductDetailsController;
import com.sharyar.jewelrysystem.controller.RemoveProductController;
import com.sharyar.jewelrysystem.controller.SearchProductByNameController;
import com.sharyar.jewelrysystem.controller.admin.AdminController;
import com.sharyar.jewelrysystem.db.admin.dto.AdminDTO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Category;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Status;

public class JewelrySystemTest {

	public static void main(String[] args)
	{
		//AdminDTO a1 = new AdminDTO(1,"Shery","Shery@gmail.com");
		//AdminController ac = new AdminController();
		//ac.saveAdmin(a1);
		//ac.printDetails();
		//ac.removeAdmin(a1);
		//ac.printDetails();
		//ac.nameStartingWith("S");
		
		
		
		
		ProductDTO p1 = new ProductDTO(1,"Flora Set", 25000, Category.Gold, Status.Available, "Nothing to say");
		ProductDTO p2 = new ProductDTO(2,"Gold Set", 50000, Category.Gold, Status.Available, "Nothing to say");
		
		
		AddProductController add = new AddProductController();
		add.addProduct(p1);
		add.addProduct(p2);
		
		DisplayAllProductController display = new DisplayAllProductController();
		display.displayAllProducts();
		
		SearchProductByNameController search = new SearchProductByNameController();
		search.searchAndDisplay("Flora");
		
		DisplayProductDetailsController ds = new DisplayProductDetailsController(2,"Gold Set");
		ds.displayProductController();
		
		RemoveProductController remove = new RemoveProductController();
		remove.removeProduct(p1);
		
		display.displayAllProducts();
		
	}
	
}
