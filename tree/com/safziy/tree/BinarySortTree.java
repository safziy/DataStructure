package com.safziy.tree;

public class BinarySortTree extends BinaryTree {

	@Override
	public void add(int t) {
		if (root == null) {
			root = new Node(t);
			return;
		}
		Node node = root;
		while (true) {
			if (t < node.t) {
				if (node.left == null) {
					node.left = new Node(t);
					return;
				}
				node = node.left;
			} else if (t > node.t) {
				if (node.right == null) {
					node.right = new Node(t);
					break;
				}
				node = node.right;
			}else{
				// the same element
				return;
			}
		}

	}

	@Override
	public boolean remove(int t) {
		Node removeNode = root;
		Node parent = root;
		while(removeNode != null){
			if (t < removeNode.t) {
				removeNode = removeNode.left;
			} else if (t > removeNode.t) {
				removeNode = removeNode.right;
			}else{
				break;
			}
			parent = removeNode;
		}
		if(removeNode == null){
			// not exits the element
			return false;
		}
		
		return false;
	}

}
