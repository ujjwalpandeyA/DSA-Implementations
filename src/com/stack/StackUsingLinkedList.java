package com.stack;

public class StackUsingLinkedList {
	class Node{
	
	 Object ele;
	 Node next;
	 
	 public Node(Object ele) {
		 this.ele=ele;
		 this.next=null;
	 }
}
	
	private Node top;
	public StackUsingLinkedList() {
		this.top=null;
	}
	
	public  void push(Object e) {
		Node n= new Node(e);
		n.next=top;
		top=n;
	}
	public Object pop() {
		if(isEmpty()) return -1;
		Object e=top.ele;
		top=top.next;
		return e;
		
	}

	private boolean isEmpty() {
		return top==null;
	}
	
	public Object peek() {
		if(isEmpty()) return -1;
		 return top.ele;
	}
}

