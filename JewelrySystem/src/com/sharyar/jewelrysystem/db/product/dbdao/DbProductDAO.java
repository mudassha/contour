package com.sharyar.jewelrysystem.db.product.dbdao;

import java.sql.*;
import java.util.ArrayList;

import com.sharyar.jewelrysystem.common.Dao;
import com.sharyar.jewelrysystem.common.connection.DatabaseConnection;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;

public class DbProductDAO implements Dao<ProductDTO> {

	@Override
	public void add(ProductDTO t) {
		// TODO Auto-generated method stub
		try {
		DatabaseConnection c = DatabaseConnection.getInstance();
		
		Connection con = c.returnConnection();
		Statement stm = con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from product");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public boolean delete(ProductDTO t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(ProductDTO t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ProductDTO> get() {
		// TODO Auto-generated method stub
		return null;
	}

}
