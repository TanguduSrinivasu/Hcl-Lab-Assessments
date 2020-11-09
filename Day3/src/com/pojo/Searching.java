package com.pojo;

public class Searching {
	public static int search(int[] integers, int search) {
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] == search) {
				return i;
			}
		}
		return -1;
	}

}
