package com.ktg.collections;

import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> emps = new TreeMap<Integer, String>();

		emps.put(123, "mahesh");
		emps.put(3, "naresh");
		emps.put(29, "suresh");
		emps.put(666, "rajesh");
		emps.put(777, "somesh");
		emps.put(546, "ritish");
		emps.put(123, "hitesh");
		System.out.println(emps);

	}

}
