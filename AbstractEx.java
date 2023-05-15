package com.ktg.oops;

interface SuperParent_Ex {
	// by default interface methods are public abstract
	// by default interface variables are public static final
	public abstract void m1();

	void m2();// public abstract void m2();

}

abstract class Parent_Ex implements SuperParent_Ex{
	public abstract int modOfTwo(int a, int b);

	public int divOfTwo(int a, int b) {
		return a / b;
	}
}

public class AbstractEx extends Parent_Ex {
	public int addOfTwo(int a, int b) {
		return a + b;
	}

	public void subOfTwo(int a, int b) {
		System.out.println("sub of to numbers:" + (a - b));
	}

	public static void main(String[] args) {

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int modOfTwo(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
