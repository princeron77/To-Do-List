package com.ron;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")  
public class LoginServlet extends HttpServlet {
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)  
			  throws ServletException, IOException {
		  
		 PrintWriter out= response.getWriter();
		 request.getRequestDispatcher("/WEB-INF/view/Login.jsp").forward(request, response);
		  
	  }

	
}
