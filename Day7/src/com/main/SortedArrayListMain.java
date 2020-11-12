package com.main;

import java.util.ArrayList;
import java.util.Scanner;
import com.pojo.SortedArrayList;
public class SortedArrayListMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		SortedArrayList list = new SortedArrayList();
		System.out.println("enter first Arraylist");
		for(int i=0;i<5;i++)
			list1.add(sc.nextInt());
		System.out.println("enter Second Arraylist");
		for(int j=0;j<5;j++)
			list2.add(sc.nextInt());
			
		 System.out.println(list.list3(list1, list2));
		 sc.close();
	}	 

}
