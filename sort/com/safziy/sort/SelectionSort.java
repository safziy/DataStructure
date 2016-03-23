package com.safziy.sort;

/**
 * 选择排序
 * 
 * 每一趟从待排序的数据元素中选出最小（或最大）的一个元素，顺序放在已排好序的数列的最后，直到全部待排序的数据元素排完。 选择排序是不稳定的排序方法。
 * 
 * 选择排序是不稳定的。算法复杂度是O(n ^2 )。
 * 
 * @author safziy
 *
 */
public class SelectionSort {
	public static void sort(int[] array, boolean isASC) {
		for (int i = array.length - 1; i > 0; i--) {
			int m = i;
			for (int j = 0; j < i; j++) {
				if (isASC) {
					if (array[j] > array[m]) {
						m = j;
					}
				} else {
					if (array[j] < array[m]) {
						m = j;
					}
				}
			}
			if (i != m) {
				_swap(array, i, m);
			}
		}
	}

	private static void _swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
