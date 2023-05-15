package com.ktg.oops;

class ParentEx {
	int age = 33;

	public ParentEx() {
		this("mahesh");
		System.out.println("parent class default constructor");
	}

	public ParentEx(String name) {

		System.out.println("parent class param constructor :" + name);
	}

	public void m1(int age) {
		System.out.println("am from parent m1 method");
	}

}

public class ThisSuperEx extends ParentEx {
	int age = 23;

	public ThisSuperEx() {
		super();
		System.out.println("default constructor ...of child");
		System.out.println(this.age);
		System.out.println(super.age);
		System.out.println(this);
		this.m1(13);
		super.m1(53);
	}

	@Override
	public void m1(int age) {
		System.out.println("am from child m1 method" + age + " " + this.age + "  " + super.age);
	}

	public static void main(String[] args) {
		// classname obj=new constructor();
		ThisSuperEx obj = new ThisSuperEx();
		// System.out.println(obj);

	}

}
