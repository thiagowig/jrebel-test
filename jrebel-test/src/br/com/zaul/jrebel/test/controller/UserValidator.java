package br.com.zaul.jrebel.test.controller;

import javax.servlet.http.HttpServletRequest;

public class UserValidator {

	public void validate(HttpServletRequest request) {
		String firstName = request.getParameter("firstName");		
		String lastName = request.getParameter("lastName");
		
		StringBuilder errorMessage = new StringBuilder();
		
		if (firstName == null || firstName.isEmpty()) {
			errorMessage.append("Null First Name<br />");
		}
		
		if (lastName == null || lastName.isEmpty()) {
			errorMessage.append("Null Last Name<br />");
		}
		
		if (errorMessage.length() > 0) {
			throw new IllegalArgumentException(errorMessage.toString());
		}
	}
}
