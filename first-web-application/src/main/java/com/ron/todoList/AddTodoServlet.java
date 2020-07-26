package com.ron.todoList;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ron.todoList.TodoService;

@WebServlet(urlPatterns = "/add-todo.do")

public class AddTodoServlet extends HttpServlet {

	private TodoService todoService = new TodoService();
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)  
			  throws ServletException, IOException {
		 PrintWriter out= response.getWriter();
		 request.getRequestDispatcher("/WEB-INF/view/add-todo.jsp").forward(request, response);
		  
	  }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String newTodo = request.getParameter("todo");
		String category = request.getParameter("category");
		todoService.addTodo(new Todo(newTodo,category));

		response.sendRedirect("/list-todos.do");
	}

}

