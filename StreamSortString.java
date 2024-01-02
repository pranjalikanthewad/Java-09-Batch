package com.assign;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamSortString {

	public static void main(String[] args) {
		
	
		ArrayList al=new ArrayList();
		al.add("Sachinnnn");
		al.add("Amol");
		al.add("Maheshhh");
		al.add("Riteshhhhhhh");
		al.add("Ram");
		al.add("Bharatttttttttt");
		
		System.out.println(al);
		
		//System.out.println(al.stream().sorted().collect(Collectors.toList()));
		
		System.out.println(al.stream().sorted((s1,s2)-> s1.toString().length()-s2.toString().length()).collect(Collectors.toList()));	
		
		
	}
	
}
