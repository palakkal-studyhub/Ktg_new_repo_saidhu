package com.ktg.oops;

public class TestEmployee {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpId(123);
		employee.setEmpName("rajesh");
		employee.setEmpSal(123123);
		employee.setEmpAdd("hyd");

		System.out.println(employee.getEmpAdd());
		System.out.println(employee.getEmpSal());
	}
}
