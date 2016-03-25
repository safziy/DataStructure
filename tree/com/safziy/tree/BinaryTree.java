package com.safziy.tree;

public abstract class BinaryTree implements Tree {
	class Node {
		Node left = null;
		Node right = null;
		int t;
		
		Node(){
		}
		
		Node(int t){
			this.t = t;
		}
	}

	Node root;

}
