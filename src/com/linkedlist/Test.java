package com.linkedlist;

public class Test {

	public static void main(String[] args) {
		
		CustomLinkedList as=new CustomLinkedList();
		
		as.add("HTML");
		as.add("CSS");
		as.add("JavaScript");
		as.add("Java");
		as.add("Spring");
		as.add("SQL");
		as.add(3,"React");
		
		as.display();
		
		as.add(4,"JDBC");
		as.add(5,"Servlet");
		as.add(6,"JPA");
		
		as.display();
		
		as.remove(4);
		as.display();

	}

}
