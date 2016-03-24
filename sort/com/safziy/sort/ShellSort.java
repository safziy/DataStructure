package com.safziy.sort;

/**
 * 希尔排序
 * 
 * 希尔排序(Shell Sort)是插入排序的一种。也称缩小增量排序，是直接插入排序算法的一种更高效的改进版本。希尔排序是非稳定排序算法。
 * 
 * 希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时
 * ，整个文件恰被分成一组，算法便终止。
 * 
 * 先取一个小于n的整数d1作为第一个增量，把文件的全部记录分组。所有距离为d1的倍数的记录放在同一个组中。先在各组内进行直接插入排序；然后，
 * 取第二个增量d2<d1重复上述的分组和排序，直至所取的增量 =1( < …<d2<d1)，即所有记录放在同一组中进行直接插入排序为止。
 * 该方法实质上是一种分组插入方法 比较相隔较远距离（称为增量）的数，使得数移动时能跨过多个元素，则进行一次比[2]
 * 较就可能消除多个元素交换。D.L.shell于1959年在以他名字命名的排序算法中实现了这一思想
 * 。算法先将要排序的一组数按某个增量d分成若干组，每组中记录的下标相差d
 * .对每组中全部元素进行排序，然后再用一个较小的增量对它进行，在每组中再进行排序。当增量减到1时，整个要排序的数被分成一组，排序完成。
 * 
 * @author safziy
 *
 */
public class ShellSort {
	public static void sort(int[] array, boolean isASC) {
		int h = 1;
		while (h <= array.length / 3) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (int i = h; i < array.length; i++) {
				int temp = array[i];
				int j = i - h;
				while (j >= 0) {
					if (isASC) {
						if (array[j] > temp) {
							array[j + h] = array[j];
						} else {
							break;
						}
					} else {
						if (array[j] < temp) {
							array[j + h] = array[j];
						} else {
							break;
						}
					}
					j -= h;
				}
				array[j + h] = temp;
			}
			h = (h - 1) / 3;
		}
	}

}
