package com.sharyar.jewelrysystem.service.product;

import java.sql.SQLException;

import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class AddProductService {

	private ProductDTO product;



	public void addProduct(ProductDTO product) throws SQLException { //throw from here also
		DbProductDAO pdao = new DbProductDAO();

		if(validate(product) == false)
		{
			throw new IllegalArgumentException("Cannot add product with null values");
		}
		else
			pdao.add(product);

	}
	public boolean validate(ProductDTO product) {

		boolean check;
		if(product.getName() == null || product.getCategory().toString()==null || product.getStatus().toString() == null || product.getDescription() == null) {

			check = false;
		}
		else
			check=true;
		return check;
	}
	//create here method validation boolean return
}

