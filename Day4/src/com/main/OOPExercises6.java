package com.main;

import com.pojo.A6;
import com.pojo.B;
import com.pojo.C;

public class OOPExercises6 {

	static int a = 555;

	public static void main(String[] args) {
		A6 objA = new A6();
		B objB1 = new B();
		A6 objB2 = new B();
		C objC1 = new C();
		B objC2 = new C();
		A6 objC3 = new C();
		objA.display();//a=100 
		objB1.display();//a=123
		objB2.display();//a=123
		objC1.display();//a=543
		objC2.display();//a=543
		objC3.display();//a=543
	}

}
