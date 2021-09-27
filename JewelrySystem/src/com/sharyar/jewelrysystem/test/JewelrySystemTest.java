package com.sharyar.jewelrysystem.test;

import com.sharyar.jewelrysystem.controller.AddProductController;

import com.sharyar.jewelrysystem.controller.DisplayAllProductController;
import com.sharyar.jewelrysystem.controller.DisplayProductDetailsController;
import com.sharyar.jewelrysystem.controller.EditProductController;
import com.sharyar.jewelrysystem.controller.RemoveProductController;
import com.sharyar.jewelrysystem.controller.SearchProductByNameController;
import com.sharyar.jewelrysystem.controller.SearchProductsByCategoryController;
import com.sharyar.jewelrysystem.db.admin.dto.AdminDTO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Category;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Status;

public class JewelrySystemTest {

	public static void main(String[] args)
	{
		
		
		
		
//		ProductDTO p1 = new ProductDTO("Platinum Set", 25000, Category.Platinum, Status.Available, "Nothing to say");
//		ProductDTO p2 = new ProductDTO("Spiral Set", 50000, Category.Silver, Status.Available, "Nothing to say again about gold");
//		
//		
//		AddProductController add = new AddProductController();
//		add.addProduct(p1);
//		add.addProduct(p2);
		
		
		
//		ProductDTO p3 = new ProductDTO("Round Set", 50000, Category.Silver, Status.Available, "Nothing to say again about gold");
	//	p3.setId(4);
		
		
		
//		EditProductController edit = new EditProductController();
//		edit.updateProduct(p3);
		
		
//		ProductDTO p = new ProductDTO();
//		p.setId(4);
//		
//		RemoveProductController r = new RemoveProductController();
//		r.removeProduct(p);
//		
		
//		DisplayAllProductController display = new DisplayAllProductController();
//		display.displayAllProducts();
		
//		DisplayProductDetailsController d = new DisplayProductDetailsController();
//		d.displayProductController(3, "Platinum Set");
//		
		
		
		ProductDTO se = new ProductDTO();
		se.setName("Flora Set");
		se.setCategory(Category.Platinum);
		SearchProductsByCategoryController c = new SearchProductsByCategoryController();
		c.search(se);
		
		SearchProductByNameController s = new SearchProductByNameController();
		s.search(se);
		
		
		
//		SearchProductByNameController search = new SearchProductByNameController();
//		search.searchAndDisplay("Flora");
//		
//		ProductDTO p3 = new ProductDTO();
//		p3.setId(1);
//		p3.setName("Flora set");
//		
//		
//		
//		DisplayProductDetailsController ds = new DisplayProductDetailsController();
//		ds.displayProductController(2,"Gold Set");
//		
//		RemoveProductController remove = new RemoveProductController();
//		remove.removeProduct(p1);
//		
//		display.displayAllProducts();
		
	}
	
}
