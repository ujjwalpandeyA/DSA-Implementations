package com.stack;

public class TestClassForStackUsingLinkedList {

	public static void main(String[] args) {
		StackUsingLinkedList st= new StackUsingLinkedList();
		 st.push(40);
		 st.push(30);
		 st.push(20);
		 st.push(10);
		 
		 System.out.println(st.peek());
		 st.pop();
		 System.out.println(st.peek());

	}

}
