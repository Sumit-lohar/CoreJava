package com.set;

import java.util.HashSet;

public class ConvertToArrayAnHashSet {

	public static void main(String[] args) {
           
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(12);
		hs.add(21);
		hs.add(32);
		hs.add(65);
		hs.add(45);
		
		System.out.println(hs);
		
		Integer [] ia = new Integer [hs.size()];
		
		ia = hs.toArray(ia);
		
		for(int  i=0; i<ia.length;i++)
			
			System.out.println(ia[i]);
		
	}

}
