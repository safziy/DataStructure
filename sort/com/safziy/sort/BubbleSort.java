package com.safziy.sort;

/**
 * 冒泡排序
 * 
 * @author safziy
 *
 */
public class BubbleSort {
	public static void sort(int[] array, boolean isASC) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (isASC) {
					if (array[j] > array[j + 1]) {
						_swap(array, j, j + 1);
					}
				} else {
					if (array[j] < array[j + 1]) {
						_swap(array, j, j + 1);
					}
				}

			}
		}
	}

	private static void _swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
