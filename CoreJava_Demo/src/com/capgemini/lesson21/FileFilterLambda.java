package com.capgemini.lesson21;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		FileFilter filter = (File pathname) -> 	pathname.getName().endsWith(".txt");
		File dir = new File("C:/Users/vs823751/Documents");
		File[] contents = dir.listFiles(filter);
		for(File file:contents) {
			System.out.println(file);
		}
	}
}
