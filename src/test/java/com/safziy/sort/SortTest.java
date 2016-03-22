package com.safziy.sort;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SortTest {
	int[] array;

	@Before
	public void before() {

	}

	@Test
	public void testBubbleSort() {

	}

	public static void main(String[] args) throws IOException {
		String path = SortTest.class.getResource("/").getPath();
		
		int numCount = 10000;
		int[] srcArray = new int[numCount];
		// 生成10份文件
		for (int i = 1; i <= 1; i++) {
			File srcFile = new File(path + "../../src/main/resources/sort/" + "src" + i + ".txt");
			if (!srcFile.exists()) {
				srcFile.createNewFile();
			}
			for (int j = 0; j < numCount; j++) {
				srcArray[j] = (int) (Math.random() * 100000);
			}
			Writer writer = new FileWriter(srcFile);
			for (int j = 0; j < numCount; j++) {
				writer.write(srcArray[j]);
				writer.write(" ");
			}
			writer.close();
			
//			OutputStream os = new FileOutputStream(srcFile);
//			for (int j = 0; j < numCount; j++) {
//				os.write(srcArray[j]);
//				os.write(' ');
//			}
//			os.close();
			
//			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(srcFile));
//			for (int j = 0; j < numCount; j++) {
//				writer.write(srcArray[j]);
//				writer.write(" ");
//			}
//			writer.close();
			Arrays.sort(srcArray);
			File descFile = new File(path + "../../src/main/resources/sort/" + "desc" + i + ".txt");
			if (!descFile.exists()) {
				descFile.createNewFile();
			}
			
			
//			os = new FileOutputStream(descFile);
//			for (int j = 0; j < numCount; j++) {
//				os.write(srcArray[j]);
//				os.write(' ');
//			}
//			os.close();
//			writer = new OutputStreamWriter(new FileOutputStream(descFile));
//			for (int j = 0; j < numCount; j++) {
//				writer.write(srcArray[j]);
//				writer.write(" ");
//			}
//			writer.close();
		}
	}
}
