package com.sharyar.jewelrysystem.service.product;



import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;


public class EditProductService {

	
	public void editAndUpdate(ProductDTO p) {
		DbProductDAO pdao = new DbProductDAO();
		pdao.update(p);
	}
}
