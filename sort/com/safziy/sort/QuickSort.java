package com.safziy.sort;

/**
 * 快速排序
 * 
 * @author safziy
 *
 */
public class QuickSort {
	public static void sort(int[] array, boolean isASC) {
		_quicksort(array, 0, array.length - 1, isASC);
	}

	private static void _quicksort(int[] array, int left, int right, boolean isASC) {
		if (left >= right) {
			return;
		}
		int pos = _partition(array, left, right, isASC);
		_quicksort(array, left, pos - 1, isASC);
		_quicksort(array, pos + 1, right, isASC);
	}

	private static int _partition(int[] array, int left, int right, boolean isASC) {
		int pivot = array[right];
		if (isASC) {
			while (left < right) {
				while (left < right && array[left] < pivot) {
					left++;
				}
				if (left < right) {
					array[right--] = array[left];
				}
				while (left < right && array[right] > pivot) {
					right--;
				}
				if (left < right) {
					array[left++] = array[right];
				}
			}
		} else {
			while (left < right) {
				while (left < right && array[left] > pivot) {
					left++;
				}
				if (left < right) {
					array[right--] = array[left];
				}
				while (left < right && array[right] < pivot) {
					right--;
				}
				if (left < right) {
					array[left++] = array[right];
				}
			}
		}
		array[left] = pivot;
		return left;
	}

}
