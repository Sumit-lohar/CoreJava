package com.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertToArrayAnLinkedList {

	public static void main(String[] args) {
        
	    LinkedList<Integer> la = new LinkedList<>();
		
		la.add(11);
		la.add(22);
		la.add(33);
		la.add(44);
		
		System.out.println(la);
		
		Integer [] ia = new Integer [la.size()];
		
		ia = la.toArray(ia);
		
		System.out.println("following to an array");
		
		for(int i=0; i<ia.length;i++)
			
			System.out.println(ia[i]);
				
	}

}
