package com.sharyar.jewelrysystem.db.product.dbdao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.sharyar.jewelrysystem.common.Dao;
import com.sharyar.jewelrysystem.common.connection.DatabaseConnection;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Category;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Status;
import com.sharyar.jewelrysystem.util.Searchable;

public class DbProductDAO implements Dao<ProductDTO>, Searchable<ProductDTO> {

	@Override
	public void add(ProductDTO t) {
		// TODO Auto-generated method stub
		try {
			DatabaseConnection c = DatabaseConnection.getInstance();

			Connection con = c.returnConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO product(product_name,product_description,product_category,product_status,product_price) VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, t.getName());
			ps.setString(2, t.getDescription());
			ps.setString(3, t.getCategory().toString());
			ps.setString(4, t.getStatus().toString());
			ps.setInt(5, t.getPrice());
			int i = ps.executeUpdate();

			System.out.println(i);

		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public boolean delete(ProductDTO t) {
		// TODO Auto-generated method stub

		try {
			DatabaseConnection c = DatabaseConnection.getInstance();

			Connection con = c.returnConnection();
			Statement stm = con.createStatement();
			int i = stm.executeUpdate("delete from product where product_id=" + t.getId());
			if(i == 1)
			{
				return true;
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void update(ProductDTO t) {
		// TODO Auto-generated method stub

		try {
			DatabaseConnection c = DatabaseConnection.getInstance();
			Connection con = c.returnConnection();

			PreparedStatement ps = con.prepareStatement("UPDATE product SET product_name=?, product_description=?, product_category=?, product_status=?,product_price=? WHERE product_id=?");
			ps.setString(1, t.getName());
			ps.setString(2, t.getDescription());
			ps.setString(3, t.getCategory().toString());
			ps.setString(4, t.getStatus().toString());
			ps.setInt(5, t.getPrice());
			ps.setInt(6, t.getId());
			int i = ps.executeUpdate();


		} catch (SQLException ex) {
			ex.printStackTrace();
		}




	}

	@Override
	public ArrayList<ProductDTO> get() {
		// TODO Auto-generated method stub
		try {
			DatabaseConnection c = DatabaseConnection.getInstance();

			Connection con = c.returnConnection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM product");
			ArrayList<ProductDTO> all = new ArrayList<ProductDTO>();

			while(rs.next())
			{
				ProductDTO product = extractProductFromResultSet(rs);
				all.add(product);

			}


			return all;

		}
		catch(Exception e) {
			e.printStackTrace();
		}


		return null;
	}

	private ProductDTO extractProductFromResultSet(ResultSet rs) throws SQLException 
	{
		ProductDTO product = new ProductDTO();

		product.setId( rs.getInt("product_id") );
		product.setName( rs.getString("product_name") );
		product.setDescription( rs.getString("product_description") );

		String cat = rs.getString("product_category");
		if(cat.equals("Gold")) {
			product.setCategory(Category.Gold);
		}
		else if(cat.equals("Silver")) {
			product.setCategory(Category.Silver);
		}
		else if(cat.equals("Platinum")) {
			product.setCategory(Category.Platinum);
		}

		String sta = rs.getString("product_status");
		if(sta.equals("Available")) {
			product.setStatus(Status.Available);
		}
		else if(sta.equals("Unavailable")) {
			product.setStatus(Status.Unavailable);
		}

		product.setPrice(rs.getInt("product_price"));

		return product;
	}


	@Override
	public List<ProductDTO> search(ProductDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ProductDTO> findByCriteria(ProductDTO t) {


		StringBuilder gquery = new StringBuilder("select * from product where 1=1");	
		if(t.getName()!=null)
		{
			gquery.append(" AND product_name like '%"+t.getName()+"%'");	
		}
		if(t.getCategory()!=null)
		{
			gquery.append(" AND product_category = '"+t.getCategory().toString()+"'");
		}


		try {
			DatabaseConnection c = DatabaseConnection.getInstance();

			Connection con = c.returnConnection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(gquery.toString());
			ArrayList<ProductDTO> all = new ArrayList<ProductDTO>();

			while(rs.next())
			{
				ProductDTO product = extractProductFromResultSet(rs);
				all.add(product);

			}

			return all;
		}
		catch(Exception e) {

		}
		return null;




		/*		
		// TODO Auto-generated method stub
		String check = "";
		if(t.getName() == null)
		{
			if(t.getCategory().toString() != null)
			{
				check = "Category";
				System.out.println("");
			}
		}

		if(t.getCategory() == null)
		{
			if(t.getName() != null)
			{
				check = "Name";
				System.out.println("");
			}
		}

		if(check.equals("Name"))
		{
			try {
				DatabaseConnection c = DatabaseConnection.getInstance();

				Connection con = c.returnConnection();
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("SELECT * FROM product where product_name='" + t.getName()+"'");
				ArrayList<ProductDTO> all = new ArrayList<ProductDTO>();

				while(rs.next())
				{
					ProductDTO product = extractProductFromResultSet(rs);
					all.add(product);

				}
				System.out.println(all);
				return all;

			}
			catch(Exception e) {
				e.printStackTrace();
			}



		}
		else if(check.equals("Category"))
		{
			try {
				DatabaseConnection c = DatabaseConnection.getInstance();

				Connection con = c.returnConnection();
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("SELECT * FROM product where product_category='"+t.getCategory().toString()+"'");
				ArrayList<ProductDTO> all = new ArrayList<ProductDTO>();

				while(rs.next())
				{
					ProductDTO product = extractProductFromResultSet(rs);
					all.add(product);

				}			
				return all;

			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {

		}

		return null;
		 */

	}
}
