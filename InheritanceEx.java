package com.ktg.oops;

//By default package for every java file is java.lang
//By default parent for every  java class is java.lang.Object

class Caluculator {
	public int addOfTwo(int a, int b) {

		return a + b;
	}

	public void subOfTwo(int a, int b) {
		System.out.println("sub of to numbers:" + (a - b));
	}
}

class MobileCaluculator extends Caluculator {
	public int modOfTwo(int a, int b) {

		return a % b;
	}

	public int divOfTwo(int a, int b) {

		return a / b;
	}
}

public class InheritanceEx extends Caluculator {
	public int mulOfTwo(int a, int b) {

		return a * b;
	}

	public static void main(String[] args) {
		InheritanceEx obj = new InheritanceEx();
		System.out.println(obj.addOfTwo(12, 13));
		obj.subOfTwo(12, 2);
		System.out.println(obj.mulOfTwo(13, 14));

	}

}
