package com.ktg.java8;

@FunctionalInterface
interface Calculator {//restriction on abstract but can  have any no of default and static methods
	public abstract int calculate(int a, int b);
	
	public default void m1()//default methods can override 
	{
		System.out.println("default method  logic from FI");
	}
	public static void m2()//static methods cant be override 
	{
		System.out.println("static method logic from FI");
	}
}

public class LamdaExpressionEx {

	public static void main(String[] args) {
		Calculator calci = (a, b) -> a + b;
		System.out.println(calci.calculate(12, 23));
		Calculator calci1 = (a, b) -> a * b;
		System.out.println(calci1.calculate(12, 23));
		Calculator calci2 = (a, b) -> a / b;
		System.out.println(calci2.calculate(12, 23));
		
		
		
		
	}

}
