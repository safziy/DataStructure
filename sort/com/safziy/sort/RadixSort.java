package com.safziy.sort;

import java.util.Arrays;

/**
 * 基数排序
 * 
 * @author safziy
 *
 */
public class RadixSort {
	private static int DEFAULT_RADIX = 16;

	public static void sort(int[] array, boolean isAsc) {
		sort(array, isAsc, DEFAULT_RADIX);
	}

	public static void sort(int[] array, boolean isASC, int initRadix) {
		if (initRadix <= 0) {
			initRadix = DEFAULT_RADIX;
		}
		// 计算(基数-1)对于2进制 有多少位
		int radixDigit = 0;
		int radix = 1;
		while (radix < initRadix) {
			radix = radix << 1;
			radixDigit++;
		}

		// 按照 基数进制的话 数组的数字最高有多少位
		int digit = 1;
		int max = radix;
		for (int i = 0; i < array.length; i++) {
			while (array[i] >= max) {
				max = max << radixDigit;
				digit++;
			}
		}

		int[] temp = new int[array.length];
		int[] buckets = new int[radix];

		radix--;

		for (int i = 0, rateDigit = 0; i < digit; i++) {
			// 重置count数组，开始统计下一个关键字
			Arrays.fill(buckets, 0);
			// 将data中的元素完全复制到tmp数组中
			System.arraycopy(array, 0, temp, 0, array.length);

			// 计算每个待排序数据的子关键字
			for (int j = 0; j < array.length; j++) {
				int subKey = (temp[j] >> rateDigit) & radix;
				buckets[subKey]++;
			}

			if (isASC) {
				for (int j = 1; j <= radix; j++) {
					buckets[j] = buckets[j] + buckets[j - 1];
				}
			} else {
				for (int j = radix - 1; j >= 0; j--) {
					buckets[j] = buckets[j] + buckets[j + 1];
				}
			}

			// 按子关键字对指定的数据进行排序
			for (int m = array.length - 1; m >= 0; m--) {
				int subKey = (temp[m] >> rateDigit) & radix;
				array[--buckets[subKey]] = temp[m];
			}

			rateDigit += radixDigit;
		}

	}

}
