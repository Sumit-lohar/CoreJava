package com.set;

import java.util.LinkedHashSet;

public class ConvertToArrayAnLinkedHashSet {

	public static void main(String[] args) {
           
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		
		hs.add("");
		
		System.out.println(hs);
		
		String [] s = new String [hs.size()];
		
		s = hs.toArray(s);
		
		for(int i=0;i<s.length;i++)
			
			System.out.println(s[i]);
		
	}

}
