package com.safziy.tree;

public abstract class BinaryTree<T> implements Tree<T> {
	class Node {
		Node left = null;
		Node right = null;
		T t;
		
		Node(){
		}
		
		Node(T t){
			this.t = t;
		}
	}

	Node root;

}
