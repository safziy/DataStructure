package com.safziy.sort;

import java.util.Comparator;

/**
 * 冒泡排序
 * 
 * 依次比较相邻的两个数，将小数放在前面，大数放在后面。即首先比较第1个和第2个数，将小数放前，大数放后。然后比较第2个数和第3个数，将小数放前，大数放后，
 * 如此继续，直至比较最后两个数，将小数放前，大数放后。重复以上过程，直至最终完成排序。
 * 
 * 冒泡排序是稳定的。算法时间复杂度是O(n ^2)。
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

	public static <T> void sort(T[] array, Comparator<? super T> c) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (c.compare(array[j], array[j + 1]) > 0) {
					_swap(array, i, j);
				}
			}
		}
	}

	private static <T> void _swap(T[] array, int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
