package com.main;

import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("D:\\test.txt");
			fw.write("Welcome to the files concept in java");
			fw.close();
			System.out.println("File Successfully Created");
		} catch (Exception e) {
			System.out.println("Error Occured" + e);
		}
	}
}
