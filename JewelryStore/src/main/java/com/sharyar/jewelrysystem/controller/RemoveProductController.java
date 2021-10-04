package com.sharyar.jewelrysystem.controller;


import java.io.IOException;
import java.sql.SQLException;

import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.service.product.RemoveProductService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RemoveProductController extends HttpServlet{

	//TODO should implement through a service later on
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ProductDTO p = new ProductDTO();
		p.setId(Integer.parseInt(req.getParameter("id")));
		RemoveProductService r = new RemoveProductService();
		try {
			r.remove(p);
			resp.sendRedirect("ShowProducts");
		} catch (SQLException e) {
			RequestDispatcher rd=req.getRequestDispatcher("ServerError.jsp");  
			String er = "Server is down for maintenance";
	        rd.forward(req, resp); 
		}
		catch (NullPointerException e) {
			RequestDispatcher rd=req.getRequestDispatcher("ServerError.jsp");  
			String er = "Product to be removed is not present";
			req.setAttribute("error", er);
	        rd.forward(req, resp); 
		}
		
	}
	
	
}
