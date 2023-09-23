package com.set;


import java.util.Stack;

public class ConvertToArrayAnHashSet2 {

	public static void main(String[] args) {
           
		Stack<Integer> stack = new Stack<>();		
		stack.add(12);
		stack.add(21);
		stack.add(32);
		stack.add(65);
		stack.add(45);
		
		System.out.println(stack);
		
		Integer [] ia = new Integer [stack.size()];
		
		ia = stack.toArray(ia);
		
		for (Integer integer : ia) {
			
			System.out.println(integer);
			
		}
		
	}

}
