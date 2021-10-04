package com.sharyar.jewelrysystem.service.product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Category;

public class SearchProductService {

	

	public List<ProductDTO> searchByCategory(ProductDTO p1) throws  SQLException {
		DbProductDAO db = new DbProductDAO();
		ArrayList<ProductDTO> ar= db.get();
			ProductDTO p2= new ProductDTO();
			p2.setCategory(p1.getCategory());
			List<ProductDTO> catpro = db.findByCriteria(p2);
			return catpro;
	}
	
	public List<ProductDTO> searchByName(ProductDTO p1) throws SQLException {
		DbProductDAO db = new DbProductDAO();
		ArrayList<ProductDTO> ar= db.get();
			ProductDTO p2= new ProductDTO();
			p2.setName(p1.getName());
			List<ProductDTO> catpro = db.findByCriteria(p2);
			return catpro;
	}

}
