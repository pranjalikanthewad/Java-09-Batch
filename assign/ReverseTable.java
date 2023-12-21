package com.assign;

import java.util.Scanner;

public class ReverseTable {

	public static void main(String[] args) {
		
		Intrf in=x->
		{
			for(int i=10;i>1;i--)
			{
				System.out.println(x*i);
			}
			return x;						
		};
		System.out.println(in.getNumber(6));
	
		
	}
}
