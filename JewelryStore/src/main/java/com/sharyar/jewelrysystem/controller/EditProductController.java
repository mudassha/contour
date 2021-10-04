package com.sharyar.jewelrysystem.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.sharyar.jewelrysystem.db.product.dbdao.DbProductDAO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Category;
import com.sharyar.jewelrysystem.db.product.dto.ProductDTO.Status;
import com.sharyar.jewelrysystem.service.product.UpdateProductService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditProductController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub



		try {

			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			String des = req.getParameter("description");
			int price = Integer.parseInt(req.getParameter("price"));

			Category c ;
			c = Category.valueOf(req.getParameter("Category"));


			Status s;
			s = Status.valueOf(req.getParameter("Status"));

			ProductDTO product = new ProductDTO(name,price,c,s,des);
			product.setId(id);
			UpdateProductService us = new UpdateProductService();
			us.update(product);

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



	}

}
