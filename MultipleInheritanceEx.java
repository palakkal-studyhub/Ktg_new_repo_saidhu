package com.ktg.oops;

interface Parent {
	public abstract void m1();
}

interface Parent1 {
	public abstract void m1();
}

public class MultipleInheritanceEx implements Parent, Parent1 {

	public static void main(String[] args) {
		MultipleInheritanceEx obj = new MultipleInheritanceEx();
		obj.m1();
	}

	@Override
	public void m1() {
		System.out.println("child implementation");
	}

}
