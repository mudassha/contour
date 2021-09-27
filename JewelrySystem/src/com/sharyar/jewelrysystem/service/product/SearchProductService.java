package com.sharyar.jewelrysystem.service.product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Category;

public class SearchProductService {
	
	DbProductDAO db = new DbProductDAO();
	ArrayList<ProductDTO> ar= db.get();
	
	public void searchByCategory(ProductDTO p1) {
		
		
		try {
			ProductDTO p2= new ProductDTO(p1);
			if(p2.getCategory().toString()!=null) {
				
				p2.setName(null); // setting name null in case user send object having both category and name in this function
				
				ArrayList<ProductDTO> catpro = db.findByCriteria(p2);
				for(ProductDTO p:catpro)
				{
					
						System.out.println("\nProduct ID : " + p.getId() + "\nProduct Name : " + p.getName() + "\nProduct Price : " + p.getPrice() + "\nProduct Category : " + p.getCategory().toString() + "\nProduct Status : " + p.getStatus().toString() + "\nProduct Description : " + p.getDescription());
					
				}
				
			}
			else if(p2.getCategory().toString()==null) {
				throw new IllegalArgumentException("Category not passed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	public void searchByName(ProductDTO p1) {
		
	try {
		ProductDTO p2= new ProductDTO(p1);
		if(p2.getName()!=null) {
			
			p2.setCategory(null); // setting category null in case user send object having both category and name in this function
			
			ArrayList<ProductDTO> catpro = db.findByCriteria(p2);
			for(ProductDTO p:catpro)
			{
				
					System.out.println("\nProduct ID : " + p.getId() + "\nProduct Name : " + p.getName() + "\nProduct Price : " + p.getPrice() + "\nProduct Category : " + p.getCategory().toString() + "\nProduct Status : " + p.getStatus().toString() + "\nProduct Description : " + p.getDescription());
				
			}
			
		}
		else
		{
			throw new IllegalArgumentException("Name not passed");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
		
	}
	public void searchByStartingAlphabets(String name) {
		
		List<String> namelist = new ArrayList<String>();
		for(ProductDTO b : ar)
		{
			namelist.add(b.getName());
			
		}
		
		
		List<String> l3 = namelist.stream().filter(s->s.startsWith(name)).collect(Collectors.toList());
		System.out.println(l3);
		
		printProducts(l3);
		
		
	}
	
	public void printProducts(List<String> l) {
		for(String li:l)
		{
			for(ProductDTO p:ar)
			{
				if(li.equals(p.getName()))
				{
					System.out.println("\nProduct ID : " + p.getId() + "\nProduct Name : " + p.getName() + "\nProduct Price : " + p.getPrice() + "\nProduct Category : " + p.getCategory().toString() + "\nProduct Status : " + p.getStatus().toString() + "\nProduct Description : " + p.getDescription());
				}
			}
		}
	}
}
