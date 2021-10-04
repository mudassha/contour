package com.sharyar.jewelrysystem.controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.service.product.DisplayProductDetailsService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class DisplayAllProductController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			DisplayProductDetailsService service = new DisplayProductDetailsService();
			List<ProductDTO> l = service.getList();
			
			req.setAttribute("products", l);
			
			RequestDispatcher rd=req.getRequestDispatcher("ShowProducts.jsp");  
	        rd.forward(req, resp); 
		}
		catch(SQLException e) {
			RequestDispatcher rd=req.getRequestDispatcher("ServerError.jsp");  
			
			String er = "Server Down Temporarily for Maintenance";
			req.setAttribute("error", er);
	        rd.forward(req, resp); 
		}
		
	}
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(req, resp);
}
	

}
