package com.safziy.tree;

public class BinarySortTree<T extends Comparable<T>> extends BinaryTree<T> {

	@Override
	public void add(T t) {
		if (root == null) {
			root = new Node(t);
			return;
		}
		Node node = root;
		while (true) {
			int c = t.compareTo(node.t);
			if (c < 0) {
				if (node.left == null) {
					node.left = new Node(t);
					return;
				}
				node = node.left;
			} else if (c > 0) {
				if (node.right == null) {
					node.right = new Node(t);
					break;
				}
				node = node.right;
			}
		}

	}

	@Override
	public boolean remove(T t) {
		return false;
	}

}
