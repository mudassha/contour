package com.sharyar.jewelrysystem.service.product;

import com.sharyar.jewelrysystem.db.product.dao.ProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class RemoveProductService {

	public void remove(ProductDTO p)
	{
		ProductDAO pdao = new ProductDAO();
		pdao.delete(p);
	}
	
}
