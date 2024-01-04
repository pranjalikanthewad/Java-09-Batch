package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUppercase {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");
		l.add("five");
		l.add("six");
		l.add("seven");
		l.add("eight");
		
		System.out.println(l);
		
		System.out.println(l.stream().map(s->s.toUpperCase()).collect(Collectors.toList()));
	}
}
