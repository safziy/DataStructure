package com.safziy.sort;
/**
 * 选择排序
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
