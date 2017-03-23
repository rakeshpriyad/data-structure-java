package com.program.java.data.structure.btree;

import java.util.LinkedList;
/**
 * Iterative Preorder Traversal
 * 
 * In this traversal, first we visit the root--> left-->right.
Given a Binary Tree, write an iterative function to print Preorder traversal of the given binary tree.

Refer this for recursive preorder traversal of Binary Tree. To convert an inherently recursive procedures to iterative, we need an explicit stack. Following is a simple stack based iterative process to print Preorder traversal.
1) Create an empty stack nodeStack and push root node to stack.
2) Do following while nodeStack is not empty.
….a) Pop an item from stack and print it.
….b) Push right child of popped item to stack
….c) Push left child of popped item to stack
 * @author aayushraj
 *
 */
class BinaryTreeIterativePreorder {
 
    Node root;
     
    void iterativePreorder()
    {
        iterativePreorder(root);
    }
 
    // An iterative process to print preorder traversal of Binary tree
    void iterativePreorder(Node node) {
         
        // Base Case
        if (node == null) {
            return;
        }
 
        // Create an empty stack and push root to it
        LinkedList<Node> nodeStack = new LinkedList<Node>();
        nodeStack.push(root);
 
        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (!nodeStack.isEmpty()) {
             
            // Pop the top item from stack and print it
            Node mynode = nodeStack.pop();
            System.out.print(mynode.data + " ");
            
 
            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
    }
 
    // driver program to test above functions
    public static void main(String args[]) {
    	BinaryTreeIterativePreorder tree = new BinaryTreeIterativePreorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.iterativePreorder();
 
    }
}
 