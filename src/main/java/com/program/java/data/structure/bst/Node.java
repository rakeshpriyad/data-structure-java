package com.program.java.data.structure.bst;

public class Node {
	int data;
	Node left,right;
	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public Node(int data) {
		this.data = data;
	}
	
}
