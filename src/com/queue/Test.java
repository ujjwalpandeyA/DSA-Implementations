package com.queue;

public class Test {

	public static void main(String[] args) {
		
		QueueusingLinkedList qal=new QueueusingLinkedList();
		
		qal.add(10);
		qal.add(20);
		qal.add(30);
		qal.add(40);
		
		System.out.println(qal.peek());

	}

}
