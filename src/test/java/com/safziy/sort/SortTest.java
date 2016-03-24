package com.safziy.sort;

import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortTest {
	static int TIMES = 10;
	static int ARRAY_COUNT = 10000;
	// 源数组
	static int[][] srcArray = new int[TIMES][ARRAY_COUNT];
	// 升序数组
	static int[][] ascArray = new int[TIMES][ARRAY_COUNT];
	// 降序数组
	static int[][] descArray = new int[TIMES][ARRAY_COUNT];

	int[][] sortAscArray = new int[TIMES][ARRAY_COUNT];
	int[][] sortDescArray = new int[TIMES][ARRAY_COUNT];

	@BeforeClass
	public static void beforeClass() {
		for (int i = 0; i < srcArray.length; i++) {
			for (int j = 0; j < srcArray[i].length; j++) {
				srcArray[i][j] = (int) (Math.random() * 100000);
				ascArray[i][j] = srcArray[i][j];
			}
			Arrays.sort(ascArray[i]);
			int len = ascArray[i].length;
			for (int j = 0; j < len; j++) {
				descArray[i][j] = ascArray[i][len - 1 - j];
			}
		}
	}

	@Before
	public void before() {
		for (int i = 0; i < srcArray.length; i++) {
			sortAscArray[i] = Arrays.copyOf(srcArray[i], srcArray[i].length);
			sortDescArray[i] = Arrays.copyOf(srcArray[i], srcArray[i].length);
		}
	}

	@After
	public void after() {
		for (int i = 0; i < sortAscArray.length; i++) {
			Assert.assertArrayEquals(sortAscArray[i], ascArray[i]);
		}
		for (int i = 0; i < sortDescArray.length; i++) {
			Assert.assertArrayEquals(sortDescArray[i], descArray[i]);
		}
	}

	@Test
	public void testBubbleSort() {
		for (int i = 0; i < sortAscArray.length; i++) {
			BubbleSort.sort(sortAscArray[i], true);
		}
		for (int i = 0; i < sortDescArray.length; i++) {
			BubbleSort.sort(sortDescArray[i], false);
		}
	}

	@Test
	public void testSelectionSort() {
		for (int i = 0; i < sortAscArray.length; i++) {
			SelectionSort.sort(sortAscArray[i], true);
		}
		for (int i = 0; i < sortDescArray.length; i++) {
			SelectionSort.sort(sortDescArray[i], false);
		}
	}

	@Test
	public void testInsertSort() {
		for (int i = 0; i < sortAscArray.length; i++) {
			InsertSort.sort(sortAscArray[i], true);
		}
		for (int i = 0; i < sortDescArray.length; i++) {
			InsertSort.sort(sortDescArray[i], false);
		}
	}

	@Test
	public void testShellSort() {
		for (int i = 0; i < sortAscArray.length; i++) {
			ShellSort.sort(sortAscArray[i], true);
		}
		for (int i = 0; i < sortDescArray.length; i++) {
			ShellSort.sort(sortDescArray[i], false);
		}
	}

	@Test
	public void testQuickSort() {
		for (int i = 0; i < sortAscArray.length; i++) {
			QuickSort.sort(sortAscArray[i], true);
		}
		for (int i = 0; i < sortDescArray.length; i++) {
			QuickSort.sort(sortDescArray[i], false);
		}
	}

	@Test
	public void testRadixSort() {
		for (int i = 0; i < sortAscArray.length; i++) {
			RadixSort.sort(sortAscArray[i], true);
		}
		for (int i = 0; i < sortDescArray.length; i++) {
			RadixSort.sort(sortDescArray[i], false);
		}
	}

	@Test
	public void testRadixSort16() {
		for (int i = 0; i < sortAscArray.length; i++) {
			RadixSort.sort(sortAscArray[i], true, 16);
		}
		for (int i = 0; i < sortDescArray.length; i++) {
			RadixSort.sort(sortDescArray[i], false, 16);
		}
	}

	@Test
	public void testRadixSort32() {
		for (int i = 0; i < sortAscArray.length; i++) {
			RadixSort.sort(sortAscArray[i], true, 32);
		}
		for (int i = 0; i < sortDescArray.length; i++) {
			RadixSort.sort(sortDescArray[i], false, 32);
		}
	}

	@Test
	public void testRadixSort64() {
		for (int i = 0; i < sortAscArray.length; i++) {
			RadixSort.sort(sortAscArray[i], true, 64);
		}
		for (int i = 0; i < sortDescArray.length; i++) {
			RadixSort.sort(sortDescArray[i], false, 64);
		}
	}
	
	@Test
	public void testRadixSort512() {
		for (int i = 0; i < sortAscArray.length; i++) {
			RadixSort.sort(sortAscArray[i], true, 512);
		}
		for (int i = 0; i < sortDescArray.length; i++) {
			RadixSort.sort(sortDescArray[i], false, 512);
		}
	}

}
