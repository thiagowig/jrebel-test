package br.com.zaul.jrebel.test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/user")
public class UserController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			new UserValidator().validate(req);
			resp.sendRedirect("index.jsp?successMessage=Cadastro realizado com sucesso");
			
		} catch (Exception e) {
			resp.sendRedirect("index.jsp?errorMessage=" + e.getMessage());
		}
		
	}
}
