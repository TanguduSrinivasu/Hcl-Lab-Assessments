package com.pojo;

public class Bike extends Cycle {

	public String define_me(){

		return "a cycle with an engine.";

		}

public Bike(){

System.out.println("Hello I am a Motorcycle I am "+ define_me());

String temp=super.define_me();

System.out.println("My ancestor is a cycle who is "+ temp );

}

}