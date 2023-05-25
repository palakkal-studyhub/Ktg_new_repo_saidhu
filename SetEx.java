package com.ktg.collections;

import java.util.TreeSet;

//1)collections are used to store both homogeneous,heterogeneous data

//2)collections  are not  fixed in size   AL-->10,16(cc*3/2)+1

//3)lots utility methods	

//	1)duplicates are not allowed
//	2)insertion order is not preserved 

public class SetEx {

	public static void main(String[] args) {
	TreeSet<String> al=new TreeSet<String>();//16
			al.add("suresh");
			al.add("akash");
			al.add("mahesh");
			al.add("naresh");
			al.add("rajesh");
			al.add("suresh");
	System.out.println(al);
	
	}

}
