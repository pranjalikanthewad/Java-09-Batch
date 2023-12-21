package com.assign;

public class ReverseString {

	public static void main(String[] args) {
		
		IntrfString s=(str)->
		{
			String ss="";
			for(int i=0;i<str.length();i++)
			{
				ss=str.charAt(i)+ss;
				
			}
			return ss;
			
		};
		System.out.println(s.reverse("Welcome to Java"));
		
		
	}
	
}
