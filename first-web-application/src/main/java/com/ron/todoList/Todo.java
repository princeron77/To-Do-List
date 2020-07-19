package com.ron.todoList;

public class Todo {

	private String name;
	
	public Todo(String name) {
		super();
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Todo [name=" + name + "]";
	}
}
