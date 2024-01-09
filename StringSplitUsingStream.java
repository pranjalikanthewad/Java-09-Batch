package com.tech;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

////Program to print the even length of string from given sentence using Stream API
public class StringSplitUsingStream {

	public static void main(String[] args) {
		
		String str="The sky is blue and vast";
		
		List<String> words=Arrays.asList(str.split(" "));
    
        List<String> l = words.stream().filter(i->i.length()%2==0).collect(Collectors.toList());
        System.out.println(l);
	}
	
}
