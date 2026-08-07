package com.stack;

public class TestClassStackUsingArray {

	public static void main(String[] args) {
		StackusingArrayList s= new StackusingArrayList();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s.peek());
		
		s.pop();
		
		System.out.println(s.peek());
		
		s.pop();
		System.out.println(s.peek());

	}

}
