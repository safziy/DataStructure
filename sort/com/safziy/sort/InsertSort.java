package com.safziy.sort;

/**
 * 插入排序
 * 
 * 每次从无序表中取出第一个元素，把它插入到有序表的合适位置，使有序表仍然有序。
 * 
 * 直接插入排序是稳定的。算法时间复杂度是O(n ^2)
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
