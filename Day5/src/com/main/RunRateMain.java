package com.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunRateMain {

	public static void main(String[] args) {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedreader = new BufferedReader(inputStreamReader);
		try {
			System.out.println("Enter the runs");
			int runs = Integer.parseInt(bufferedreader.readLine());
			System.out.println("Enter the overs");
			int overs = Integer.parseInt(bufferedreader.readLine());
			if (overs == 0)
				throw new Exception();
			double runrate = (double) runs / overs;
			System.out.println(" Curent Run Rate is : ");
			System.out.printf("%.2f", runrate);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
