package com.ron.todoList;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	public static List<Todo> todos=new ArrayList<>();
	
	static {
		todos.add(new Todo("Learn web development","study"));
		todos.add(new Todo("Learn Spring MVC","study"));
		todos.add(new Todo("Learn Spring REST services","study"));
	}
	
	public List<Todo> retrieveTodos(){
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}

}
