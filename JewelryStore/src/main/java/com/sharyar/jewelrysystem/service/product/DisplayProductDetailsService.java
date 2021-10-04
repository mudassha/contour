package com.sharyar.jewelrysystem.service.product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class DisplayProductDetailsService{



	public ProductDTO displayProductDetails(int id) throws SQLException {
		DbProductDAO dbdao = new DbProductDAO();
		List<ProductDTO> a = dbdao.get();


		for(ProductDTO pobj : a)
		{

			if(pobj.getId() == id)
			{

				return pobj;

			}

		}
		return null;
	}


	public List<ProductDTO> getList() throws SQLException{
		DbProductDAO dbdao = new DbProductDAO();
		List<ProductDTO> a = dbdao.get();

		return a;
	}
}
