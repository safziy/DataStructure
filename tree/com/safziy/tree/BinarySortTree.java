package com.safziy.tree;

public class BinarySortTree<E> {

	/**
	 * 根节点
	 */
	private Entry<E> root = null;

	/**
	 * 树中元素个数
	 */
	private int size = 0;

	public BinarySortTree() {
	}

	public int size() {
		return size;
	}

	/**
	 * 使用递归实现查找元素
	 * 
	 * @param e
	 *            需要查询的元素
	 * @param node
	 *            从什么节点往下查
	 * @return 是否包含此元素
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	private boolean searchBST(Object e, Entry<E> node) {
		if (node == null) {
			return false;
		}
		Comparable<? super E> ec = (Comparable<? super E>) e;
		int cmp = ec.compareTo(node.element);
		if (cmp < 0) {
			return searchBST(e, node.left);
		} else if (cmp > 0) {
			return searchBST(e, node.right);
		} else {
			return true;
		}

	}

	/**
	 * 使用非递归实现查找元素
	 * 
	 * @param e
	 *            需要查询的元素
	 * @param node
	 *            从什么节点往下查
	 * @return 是否包含此元素
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	private boolean searchBST1(Object e, Entry<E> node) {
		Comparable<? super E> ec = (Comparable<? super E>) e;
		Entry<E> parent = node;
		while (parent != null) {
			int cmp = ec.compareTo(parent.element);
			if (cmp < 0) {
				parent = parent.left;
			} else if (cmp > 0) {
				parent = parent.right;
			} else {
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public boolean add(E e) {
		if (root == null) {
			root = new Entry<E>(e, null);
			size = 1;
			return true;
		}
		Comparable<? super E> ec = (Comparable<? super E>) e;
		Entry<E> parent = root;
		Entry<E> pp = root;
		while (parent != null) {
			pp = parent;
			int cmp = ec.compareTo(parent.element);
			if (cmp < 0) {
				parent = parent.left;
			} else if (cmp > 0) {
				parent = parent.right;
			} else {
				return false;
			}
		}
		int cmp = ec.compareTo(pp.element);
		if (cmp < 0) {
			pp.left = new Entry<E>(e, pp);
		} else if (cmp > 0) {
			pp.right= new Entry<E>(e, pp);
		}
		size ++;
		return true;
	}

	/**
	 * 树节点，为方便起见不写get，Set方法
	 */
	static class Entry<E> {
		E element;
		Entry<E> parent;
		Entry<E> left;
		Entry<E> right;

		public Entry(E element, Entry<E> parent) {
			this.element = element;
			this.parent = parent;
		}

		public Entry() {
		}
	}

}
