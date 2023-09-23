package com.list;

import java.util.ArrayList;

public class ConvertToArrayAnArrayList {

	public static void main(String[] args) {
        
		ArrayList<Integer>  al =  new ArrayList<>();
		
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		
		System.out.println(al);
		
		Integer [] ia = new Integer [al.size()];
		
		ia = al.toArray(ia);
		
		System.out.println("following to an array");
		
		for(int i=0; i<ia.length;i++)
			
			System.out.println(ia[i]);
		
		
		
	}

}
