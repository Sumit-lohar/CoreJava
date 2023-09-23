package com.set;

import java.util.Vector;

public class ConvertToArrayAnVector {

	public static void main(String[] args) {
           
		Vector<Integer> v = new Vector<>();
		
		v.add(12);
		v.add(21);
		v.add(52);
		v.add(65);
		
		System.out.println(v);
		
		Integer []  s =  new Integer[v.size()];
		
		s = v.toArray(s);
		
		for(int i=0;i<s.length;i++)
			
			System.out.println(s[i]);
		
		
		
		
		
		
	}

}
