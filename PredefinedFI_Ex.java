package com.ktg.java8;

import java.util.function.Predicate;

public class PredefinedFI_Ex {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		System.out.println(predicate.test(21));

	}

}
