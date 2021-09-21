package com.sharyar.jewelrysystem.service.product;



import com.sharyar.jewelrysystem.db.product.dao.ProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;


public class EditProductService {

	
	public void editAndUpdate(ProductDTO p) {
		ProductDAO pdao = new ProductDAO();
		pdao.update(p);
	}
}
