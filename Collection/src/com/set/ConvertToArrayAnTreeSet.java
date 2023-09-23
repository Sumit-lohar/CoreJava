package com.set;

import java.util.TreeSet;

public class ConvertToArrayAnTreeSet {

	public static void main(String[] args) {
           
		  TreeSet<Double> ts = new TreeSet<>();
		  
		  ts.add(12.0);
		  ts.add(3.2);
		  ts.add(25.2);
		  ts.add(23.1);
		  
		  System.out.println(ts);
		  
		  Double [] d = new Double [ts.size()];
		  
		  d = ts.toArray(d);
		  
		  for(int i=0;i<d.length;i++)
			  
			  System.out.println(d[i]);
		  
		  
		  
	}

}
