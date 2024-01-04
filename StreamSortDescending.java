package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortDescending {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(15);
		l.add(8);
		l.add(49);
		l.add(25);
		l.add(98);
		l.add(12);
		l.add(2);
		
		System.out.println(l);
		
		System.out.println(l.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList()));
	}
}
