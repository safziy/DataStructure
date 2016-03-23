package com.safziy.sort;

/**
 * 插入排序
 * 
 * @author safziy
 *
 */
public class InsertSort {
	public static void sort(int[] array, boolean isASC) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			while (j >= 0) {
				if (isASC) {
					if (array[j] > temp) {
						array[j + 1] = array[j];
					} else {
						break;
					}
				} else {
					if (array[j] < temp) {
						array[j + 1] = array[j];
					} else {
						break;
					}
				}
				j--;
			}
			array[j + 1] = temp;
		}
	}

}
