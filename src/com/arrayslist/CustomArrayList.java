package com.arrayslist;

public class CustomArrayList {
	
	private Object[] a;
	private int x=0;
	public CustomArrayList() {
		a=new Object[10];
	}
	
	public void add(Object e) {
		if(x>=a.length) {
			increaseSize();
		}
		a[x++]=e;
	}
	
	public void add(int index, Object e) {
		if(index<0 || index>x) {
			throw new IndexOutOfBoundsException();
		}
		if(x>=a.length) {
			increaseSize();
		}
		for(int i=x-1; i>=index; i--) {
			a[i+1]=a[i];	
		}
		a[index]=e;
		x++;
	}
	
	public void remove(int index) {
		if(index<0 || index>x) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=index; i<x-1; i++) {
			a[i]=a[i+1];
		}
		a[x-1]=null;
		x--;	
	}
	

	private void increaseSize() {
		
		int cap=a.length+(a.length/2);
		
		Object[] temp= new Object[cap];
		 for(int i=0; i<a.length; i++) {
			 temp[i]=a[i];
		 }
		 a=temp;
		
	}
	public int size() {
		return x;
	}
	
	public Object get(int index) {
		if(index<0 || index>=x) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
		public void display() {
		    System.out.print("Elements: [");
		    for (int i = 0; i < x; i++) {
		        System.out.print(a[i]);
		        if (i < x - 1) {
		            System.out.print(", ");
		        }
		    }
		    System.out.println("]");
		
		
	}
}
