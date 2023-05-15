package com.ktg.oops;

public class ConstructorEx {

	public ConstructorEx() {
		System.out.println("am from default constructor ");
	}
	public ConstructorEx(String name) {
		System.out.println("am from param constructor ");
	}
	public void m1() {
		System.out.println("Am from m1 method");
	}

	public static void main(String[] args) {
		ConstructorEx obj = new ConstructorEx("ktgroup");
		obj.m1();
	}

}
