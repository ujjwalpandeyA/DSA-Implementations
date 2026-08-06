package com.tree;

public class BinarySearchTree {
	
	class Node{
		int key;
		Node left;
		Node right;
		public Node(int k) {
			key=k;
			left=null;
			right=null;		
		}		
	}
	
	private Node root=null;
	public int count=0;
	
	public void add(int key) {
		if(root==null) {
			root= new Node(key);
			count++;
			return;	
		}
		Node prev=null;
		Node curr=root;
		
		while(curr!=null) {
			if(key<curr.key) {
				prev=curr;
				curr=curr.left;
			}else if(key>curr.key){
				prev=curr;
				curr=curr.right;			
			}else return;
		}
	
	if(key<prev.key) {
		prev.left=new Node(key);
	}else {
		prev.right=new Node(key);
	}
	count++;
	}
}
