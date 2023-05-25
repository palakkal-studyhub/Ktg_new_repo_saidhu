package com.ktg.collections;

import java.util.ArrayList;
import java.util.Iterator;

//1)collections are used to store both homogeneous,heterogeneous data

//2)collections  are not  fixed in size   AL-->10,16(cc*3/2)+1

//3)lots utility methods	

//	1)duplicates are allowed
//	2)insertion order is preserved 

public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();// 10
		al.add("suresh");
		al.add("akash");
		al.add("mahesh");
		al.add("naresh");
		al.add(1,"sandeep");
		al.add("rajesh");
		al.add("suresh");
		al.add("chintu");
		al.add("shiva");
		System.out.println(al.indexOf("suresh"));
		System.out.println(al.lastIndexOf("suresh"));
		System.out.println(al.get(4));
		
		Iterator<String> itr=al.iterator();
			
			while(itr.hasNext())
			{
				String name=itr.next();
				if(name.endsWith("esh"))
					System.out.println(name);
			}
		
		
		
		
//		al.remove("mahesh");
//	//	al.clear();
//		System.out.println(al);
//		System.out.println(al.contains("akash"));
//
//		ArrayList<String> al1 = new ArrayList<String>();// 10
//		al1.add("chintu");
//		al1.add("shiva");
//		System.out.println(al1);
//		al1.addAll(al);
//		System.out.println(al1);
//	//	al1.removeAll(al);
//	//	al1.retainAll(al);
//		System.out.println(al1.containsAll(al));
	}

}
