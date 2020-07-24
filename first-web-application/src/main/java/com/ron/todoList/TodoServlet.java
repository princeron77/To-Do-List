package com.ron.todoList;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;


import com.ron.todoList.TodoService;

@WebServlet(urlPatterns = "/todo.do")  

public class TodoServlet extends HttpServlet {
	
	private TodoService todoService=new TodoService();
	
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)  
			  throws ServletException, IOException {
		 PrintWriter out= response.getWriter();
		 request.setAttribute("todos",todoService.retrieveTodos() );
		 request.getRequestDispatcher("/WEB-INF/view/Todo.jsp").forward(request, response);
		  
	  }
	  
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)  
			  throws ServletException, IOException {
		String newTodo=request.getParameter("todo");
		todoService.addTodo(new Todo(newTodo));
		
		response.sendRedirect("\todo.do");
		
//		 request.setAttribute("todos",todoService.retrieveTodos() );
//		 request.getRequestDispatcher("/WEB-INF/view/Todo.jsp").forward(request, response);
		  
	  }

	
}
