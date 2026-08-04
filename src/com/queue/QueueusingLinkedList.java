package com.queue;

public class QueueusingLinkedList {
	class Node {
		Object ele;
		Node next;
		
		public Node(Object ele, Node next) {
			this.ele=ele;
			this.next=next;
		}
	}
	private Node first= null;
	private Node last=null;
	private int count=0;

public void add(Object e) {
	if(first==null) {
		first=new Node(e,null);
		last=first;
		count++;
		return;
	}
	last.next=new Node(e,null);
	last=last.next;
	count++;
}

public int size() {
	return count; 
}

public Object poll() {
	if(first==null) return null;
	
	Object n= first.ele;
	first=first.next;
	if(first==null) {
		last=null;
	}
	count--;
	return n;	
}
public Object peek() {
	if(first==null) return null;
	return first.ele;
}
}
