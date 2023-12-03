package com.MapAssign;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class Map_Third_Assignment {

	public static void main(String[] args) 
	{
		List<String> State1=new ArrayList<String>();
		State1.add("A1");
		State1.add("A2");
		
		List<String> State2=new ArrayList<String>();
		State2.add("A3");
		State2.add("A4");
		
		List<String> State3=new ArrayList<String>();
		State3.add("A5");
		State3.add("A6");
		
		List<String> State4=new ArrayList<String>();
		State4.add("A7");
		State4.add("A8");
		
		List <List<String>> Country1=new ArrayList<List<String>>();
		Country1.add(State1);
		Country1.add(State2);
		
		List <List<String>> Country2=new ArrayList<List<String>>();
		Country2.add(State3);
		Country2.add(State4);
		
		
		Map <String, List<List<String>>> World=new HashMap<String,List<List<String>>>();
		World.put("Country1", Country1);
		World.put("Country2", Country2);
		
		System.out.println(World);
		
		Collection<List<List<String>>> Values=World.values();
		Set<String> Keys=World.keySet();
		
		//Using Iterator
		Iterator<String> itr=Keys.iterator();
		while(itr.hasNext())
		{
			String key1=itr.next();
			List<List<String>> list=World.get(key1);
			
			Iterator<List<String>> itr2=list.iterator();
			while(itr2.hasNext())
			{				
				List<String> list2=itr2.next();
				
				Iterator<String> itr3=list2.iterator();
				while(itr3.hasNext())
				{
					String list3=itr3.next();
					System.out.println(list3);
				}			
			}
		}
		
		//Using For each Loop
		for(String s:Keys)
		{
			List<List<String>> list=World.get(s);
			System.out.println(s);
			
			for(List<String> dist:list)
			{
				//System.out.println(dist);
				
				for(String dist2:dist)
				{
					System.out.println(dist2);
				}
			}
			
		}
		
		
		
		
		
	}
}
