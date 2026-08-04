package com.arrayslist;

public class Main {

	public static void main(String[] args) {
		
		CustomArrayList con=new CustomArrayList();
		
		con.add(10);
		con.add(20);
		con.add(30);
		con.add(50);
		con.add(3,40);
		con.add(70);
		con.add(60);
		
		System.out.print("Elements: [");
		for(int i=0; i<con.size(); i++) {
			System.out.print(con.get(i));
			if(i<con.size()-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		con.remove(5);
		con.display();
	}
}
