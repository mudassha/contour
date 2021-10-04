package com.sharyar.jewelrysystem.controller;


import java.io.IOException;
import java.sql.SQLException;

import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Category;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Status;
import com.sharyar.jewelrysystem.service.product.AddProductService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddProductController extends HttpServlet {

	//TODO should implement through service later on 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			String name = req.getParameter("name");
			String des = req.getParameter("description");
			int price = Integer.parseInt(req.getParameter("price"));
			Category c ;
			c = Category.valueOf(req.getParameter("Category"));


			Status s;
			s = Status.valueOf(req.getParameter("Status"));



			ProductDTO product = new ProductDTO(name,price,c,s,des);
			AddProductService add = new AddProductService();
			add.addProduct(product); //send product here

			resp.sendRedirect("ShowProducts");
		}


		catch(IllegalArgumentException e) {
			RequestDispatcher rd=req.getRequestDispatcher("ServerError.jsp"); 
			String er = "Input format incorrect";
			req.setAttribute("error", er);
			rd.forward(req, resp);
		}
		catch(SQLException e) {
			RequestDispatcher rd=req.getRequestDispatcher("ServerError.jsp"); 
			String er = "Server Down For Maintenance";
			req.setAttribute("error", er);
			rd.forward(req, resp);
		}
		catch(Exception e)
		{
			RequestDispatcher rd=req.getRequestDispatcher("ServerError.jsp"); 
			String er = e.toString();
			req.setAttribute("error", er);
			rd.forward(req, resp);
		}

	}


}
