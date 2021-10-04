package com.sharyar.jewelrysystem.service.product;

import java.sql.SQLException;

import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class UpdateProductService {



	public void update(ProductDTO product) throws SQLException {
		DbProductDAO pdao = new DbProductDAO();

		if(validate(product) == false)
		{
			throw new IllegalArgumentException("Cannot update product with null values");
		}
		else
			pdao.update(product);
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
}
