package com.pojo;
import java.util.ArrayList;
import java.util.Collections;
public class SortedArrayList
{
	public static ArrayList<Integer> list3(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		list1.addAll(list2);
		Collections.sort(list1);
		ArrayList<Integer> ans= new ArrayList<Integer>();
		ans.add(list1.get(2));
		ans.add(list1.get(6));
		ans.add(list1.get(8));
		return ans;
	}
}

	

