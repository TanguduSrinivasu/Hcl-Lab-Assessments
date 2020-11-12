package com.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OpenTextFile {

	public static void main(String[] args) throws IOException {
		FileReader filereader = null;
		int var;
		try {
			filereader = new FileReader("D:\\testout.txt");
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		}
		while ((var = filereader.read()) != -1) {
			System.out.print((char) var);
		}
		filereader.close();

	}

}
