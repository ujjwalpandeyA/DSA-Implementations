package com.stack;

import java.util.EmptyStackException;

public class StackusingArrayList {
	
	private Object[] arr=new Object[5];
	private int x=0;
	
	public void push(Object e) {
		if(x>=arr.length) {
			increseSize();
		}
		arr[x]=e;
		x++;
	}
	
	public Object pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		x--;
		Object e=arr[x];
		arr[x]=null;
		return e;
	}

	private boolean isEmpty() {
		return x==0;
	}
	
	public Object peek() {
		if(isEmpty()) {
			throw new EmptyStackException();	
		}
		return arr[x-1];	
	}
	
	private void increseSize() {
		
		int cap= arr.length+(arr.length)/2;
		Object[] temp= new Object[cap];
		
		for(int i=0; i<arr.length; i++) {
		    temp[i]=arr[i];
		}
		arr=temp;
	}
	

}
