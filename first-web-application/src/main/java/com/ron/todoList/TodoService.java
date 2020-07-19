package com.ron.todoList;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	public static List<Todo> todos=new ArrayList<>();
	
	static {
		todos.add(new Todo("Learn web development"));
		todos.add(new Todo("Learn Spring MVC"));
		todos.add(new Todo("Learn Spring REST services"));
	}
	
	public List<Todo> retrieveTodos(){
		return todos;
	}
}
