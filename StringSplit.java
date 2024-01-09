package com.tech;

//Program to print the even length of string from given sentence
public class StringSplit {
	
	public static void main(String[] args) {
		
		String str="The sky is blue and vast";
		
		// Split the string into an array of words  
        String[] words = str.split(" ");  
        
        for(String w:words)
        {
        	//To check whether length of string is even or not
        	if(w.length()%2==0) 
        	 {  
                 System.out.println(w);  
           } 
//        	if(w.length()%2==1)
//        	{
//        		System.out.println(w);
//        	}
        }		
	}
}
