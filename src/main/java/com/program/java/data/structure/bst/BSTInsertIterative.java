package com.program.java.data.structure.bst;

public class BSTInsertIterative {
	private Node root;

	public static void main(String arg[]) {
		BSTInsertIterative b = new BSTInsertIterative();
		b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);
		System.out.println("");

	}

	private void display(Node node) {
		if (node != null) {
			display(node.left);
			System.out.print(" " + node.data);
			display(node.right);
		}

	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current=null, tmp;
		tmp = root;
		while (tmp != null) {
			current = tmp;
			if (data < tmp.data) {
				tmp = tmp.left;
			} else {
				tmp = tmp.right;
			}
		}

		if (data < current.data) {
			current.left = newNode;
		} else {
			current.right = newNode;
		}

	}

}
