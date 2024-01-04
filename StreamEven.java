package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEven {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(8);
		l.add(49);
		l.add(25);
		l.add(98);
		l.add(32);
		l.add(2);
		l.add(30);
		System.out.println(l);
		
		List<Integer> list = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list);
	
	}
	
}
