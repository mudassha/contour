package com.sharyar.jewelrysystem.db.product.dao;


import java.util.*;


import com.sharyar.jewelrysystem.common.Dao;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.util.Searchable;

public class ProductDAO implements Dao<ProductDTO>{

	
	private static ArrayList<ProductDTO> productlist = new ArrayList<ProductDTO>();
	@Override
	public void add(ProductDTO p) {
		// TODO Auto-generated method stub
		
		
		 
		try {
		productlist.add(p);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	

	@Override
	public ArrayList<ProductDTO> get() {
		// TODO Auto-generated method stub
		
		return productlist;
	
	}

	@Override
	public boolean delete(ProductDTO p) {
		// TODO Auto-generated method stub
		
		boolean status = productlist.remove(p);
		return status;
		
	}

	@Override
	public void update(ProductDTO t) {
		// TODO Auto-generated method stub
//		for(ProductDTO list : productlist)
//		{
//			int x = 0;
//			if(t.getId() == list.getId())
//			{
//				productlist.add(x, t);
//				x++;
//			}
//		}
		
		
		
	}





}



