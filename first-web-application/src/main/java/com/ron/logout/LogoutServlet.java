package com.ron.logout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;


import com.ron.todoList.TodoService;

@WebServlet(urlPatterns = "/logout.do")  

public class LogoutServlet extends HttpServlet {
	
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)  
			  throws ServletException, IOException {
		  request.getSession().invalidate();
		 request.getRequestDispatcher("/WEB-INF/view/Login.jsp").forward(request, response);
		    
	  }

	
}
