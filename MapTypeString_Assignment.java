package com.MapAssign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class MapTypeString_Assignment {
	public static void main(String[] args) {
		
		Map <String,List> India= new HashMap();
		
		List<String> MH=new ArrayList<String>();
		MH.add("Pune");
		MH.add("Thane");
		
		List<String> GJ=new ArrayList<String>();
		GJ.add("C1");
		GJ.add("C2");
		
		India.put("Mharashtra",MH);
		India.put("Gujarat",GJ);
		
		System.out.println(India);
		//System.out.println(MH);
		//System.out.println(GJ);
		
		
		Set<String> keys=India.keySet();
		System.out.println(keys);
		
		Iterator<String> itr=keys.iterator();
		//Iterator<String>itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			List value=India.get(key);
//			System.out.println(key);
//			System.out.println(value);
//			
			Iterator itr1=MH.iterator();
			while(itr1.hasNext())
			{
				String s=(String) itr1.next();
				System.out.println(s);
			}
			
		}
		
	
		
		
		
	}
	
	
	
	
	

}
