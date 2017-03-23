package com.program.java.data.structure.bt;

import java.util.LinkedList;

public class BinaryTreeInOrder {
	private Node root;
	public void inOrder(){
		if(root==null)return;
		
		LinkedList<Node> stack = new LinkedList<Node>();
		Node node = root;
		node = pushToStack(stack,node);
		
		while(!stack.isEmpty()){
			node=stack.pop();
			System.out.println(node.data);
			if(node.right != null){
				node = node.right;
				node =pushToStack(stack,node);
			}
			
			
		}
		
	}

	private Node pushToStack(LinkedList<Node> stack,Node node){
		while(node!=null){
			stack.push(node);
			node = node.left;
		}
		
		return node;
	}
	
	public static void main(String[] args) {
		BinaryTreeInOrder tree = new BinaryTreeInOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inOrder();
	}
}
