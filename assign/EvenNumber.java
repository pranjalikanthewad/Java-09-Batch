package com.assign;

public class EvenNumber {

	public static void main(String[] args) {
		
		Intrf2 in = () -> 
		{
			for (int i = 1; i <= 100; i++) 
			{
				if (i % 2 == 0) 
				{
					System.out.println(i);
				}

			}
		};
		in.test();

	}
}
