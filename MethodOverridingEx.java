package com.ktg.oops;

 class ParentClass {//final
	 int age = 30;//final  before variable,method,class

	public  void add(int a, int b) {
		System.out.println("add of two int's :" + (a + b));
	}

	public  void changeAge() {
		++age;
		System.out.println("Your Age is :" + age);
	}

}

public class MethodOverridingEx extends ParentClass {
	public void mul(int a, int b) {
		System.out.println("mul of two int's :" + (a * b));
	}

	@Override
	public void changeAge() {
		--age;
		System.out.println("Your Age is :" + age);
	}

	public static void main(String[] args) {
		MethodOverridingEx obj = new MethodOverridingEx();
		obj.changeAge();
	}

}
