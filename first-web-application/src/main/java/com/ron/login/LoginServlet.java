package com.ron.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;


import com.ron.todoList.TodoService;

@WebServlet(urlPatterns = "/login.do")  //new in servlet notations to redirect action name

public class LoginServlet extends HttpServlet {
	
	private LoginService userValidationService=new LoginService(); //object to use classes
	private TodoService todoService=new TodoService();
	
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)  
			  throws ServletException, IOException {
		 request.getRequestDispatcher("/WEB-INF/view/Login.jsp").forward(request, response);
		  
	  }
	  
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)  
			  throws ServletException, IOException {
		 PrintWriter out= response.getWriter();
		 String name=request.getParameter("name");
		 String password=request.getParameter("password");
		 
		 boolean isUserValid=userValidationService.isUserValid(name, password);
		 
		 if(isUserValid) {
			 request.getSession().setAttribute("name", name);
			response.sendRedirect("/list-todos.do");
		 }
		 else {
			 request.setAttribute("errorMessage", "Invalid Credentials");
			 request.getRequestDispatcher("/WEB-INF/view/Login.jsp").forward(request, response);
		 }
		
		  
	  }

	
}
