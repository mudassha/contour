package com.sharyar.jewelrysystem.service.product;

import java.sql.SQLException;

import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class RemoveProductService {

	public void remove(ProductDTO p) throws SQLException
	{
		DbProductDAO pdao = new DbProductDAO();
		pdao.delete(p);
	}
	
}
