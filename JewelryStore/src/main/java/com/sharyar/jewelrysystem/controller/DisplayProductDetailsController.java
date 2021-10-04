package com.sharyar.jewelrysystem.controller;


import java.io.IOException;
import java.sql.SQLException;

import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.service.product.DisplayProductDetailsService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayProductDetailsController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// TODO Auto-generated method stub
		DisplayProductDetailsService dis = new DisplayProductDetailsService();
		ProductDTO getdetails;
		try {
			
			getdetails = dis.displayProductDetails(Integer.parseInt(req.getParameter("id")));
			req.setAttribute("details", getdetails);
			if(req.getParameter("edit") != null) {
				RequestDispatcher rd=req.getRequestDispatcher("EditProduct.jsp");  
		        rd.forward(req, resp);
			}
			else {
			
			RequestDispatcher rd=req.getRequestDispatcher("ProductDetails.jsp");  
	        rd.forward(req, resp);
	        
			}
	        
		} catch (SQLException e) {
			
			RequestDispatcher rd=req.getRequestDispatcher("ServerError.jsp");  
			
			String er = "Server Down Temporarily for Maintenance";
			req.setAttribute("error", er);
	        rd.forward(req, resp); 
		}
		catch (NumberFormatException n) {
			
			RequestDispatcher rd=req.getRequestDispatcher("ServerError.jsp");  
			
			String er = "ID is not in correct form";
			req.setAttribute("error", er);
	        rd.forward(req, resp); 
		}
		
		
		
	}
	
	
	
}
