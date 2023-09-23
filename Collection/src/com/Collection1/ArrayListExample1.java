package com.Collection1;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(111);
		al.add(122);
		al.add(133);
		al.add(144);
		al.add(155);

		ArrayList<Integer> al2 = new ArrayList<>();

		al2.add(11);
		al2.add(22);
		al2.add(33);
		al2.add(44);
		al2.add(55);

		System.out.println(al);

		System.out.println(al2);

		ArrayList<Integer> al3 = new ArrayList<>(al);

		al3.addAll(al2);

		System.out.println(al3);

		ArrayList<Integer> al4 = new ArrayList<>(al2);

		al4.addAll(al);

		System.out.println(al4);

		// order is preserve
		
		
		System.out.println("Size of al:-"+al.size());
		System.out.println("Size of a2:-"+al2.size());
		System.out.println("Size of a3:-"+al3.size());
		System.out.println("Size of a4:-"+al4.size());
	}

}
