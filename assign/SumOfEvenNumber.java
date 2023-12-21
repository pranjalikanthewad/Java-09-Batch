package com.assign;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		
		Intrf in = (x) -> 
		{
			int sum=0;
			for (int i=2;i<=x;i++) 
			{
				if(i%2==0)
				{
					sum=sum+i;
				}
			}
			System.out.println(sum);
			return x;
		};
		in.getNumber(10);
		
	}
}
