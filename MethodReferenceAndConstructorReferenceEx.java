package com.ktg.java8;

@FunctionalInterface
interface CalciDemo {
	public abstract void caculate(int a, int b);
}

public class MethodReferenceAndConstructorReferenceEx {

	public MethodReferenceAndConstructorReferenceEx(int a, int b) {
		System.out.println("sub of two numbers : " + (a - b));
	}

	public MethodReferenceAndConstructorReferenceEx() {
		System.out.println("default constructor");
	}

	public void m1(int a, int b) {
		System.out.println("add of two numbers : " + (a + b));
	}

	public static void m2(int a, int b) {
		System.out.println("div of two numbers : " + (a / b));
	}

	public static void main(String[] args) {
		MethodReferenceAndConstructorReferenceEx obj = new MethodReferenceAndConstructorReferenceEx();
		CalciDemo calci = (a, b) -> System.out.println(a * b);
		calci.caculate(2, 6);

		CalciDemo calci1 = obj::m1;
		calci1.caculate(2, 6);
		CalciDemo calci2 = MethodReferenceAndConstructorReferenceEx::m2;
		calci2.caculate(2, 6);
		CalciDemo calci3 = MethodReferenceAndConstructorReferenceEx::new;
		calci3.caculate(2, 6);
	}

}
