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
	static int[][] srcArray = new int[TIMES][ARRAY_COUNT];
	static int[][] descArray = new int[TIMES][ARRAY_COUNT];

	int[][] sortArray = new int[TIMES][ARRAY_COUNT];

	@BeforeClass
	public static void beforeClass() {
		for (int i = 0; i < srcArray.length; i++) {
			for (int j = 0; j < srcArray[i].length; j++) {
				srcArray[i][j] = (int) (Math.random() * 100000);
				descArray[i][j] = srcArray[i][j];
			}
			Arrays.sort(descArray[i]);
		}
	}

	@Before
	public void before() {
		for (int i = 0; i < srcArray.length; i++) {
			sortArray[i] = Arrays.copyOf(srcArray[i], srcArray[i].length);
		}
	}

	@After
	public void after() {
		for (int i = 0; i < sortArray.length; i++) {
			Assert.assertArrayEquals(sortArray[i], descArray[i]);
		}
	}

	@Test
	public void testBubbleSort() {
		for (int i = 0; i < srcArray.length; i++) {
			BubbleSort.sort(sortArray[i], true);
		}
	}

	@Test
	public void testSelectionSort() {
		for (int i = 0; i < srcArray.length; i++) {
			SelectionSort.sort(sortArray[i], true);
		}
	}
	
	@Test
	public void testInsertSort(){
		for (int i = 0; i < srcArray.length; i++) {
			InsertSort.sort(sortArray[i], true);
		}
	}

}
