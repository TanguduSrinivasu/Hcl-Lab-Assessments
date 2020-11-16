package com.main;

import com.pojo.B;

public class ABMain {

	public static void main(String[] args) {
		B b = new B();
		System.out.println("Name :" + b.getName());
		System.out.println("Roll no:" + b.getRollNo());
		b.display();
	}

}