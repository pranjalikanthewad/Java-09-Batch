package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterNumber {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(51);
		l.add(8);
		l.add(49);
		l.add(25);
		l.add(98);
		l.add(120);
		l.add(2);
		
		System.out.println(l);
		
		System.out.println(l.stream().filter(i->i>50).collect(Collectors.toList()));
	}
}
