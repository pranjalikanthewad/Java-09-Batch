package com.MapAssign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapOfListAndSet {

	
	public static void main(String[] args) {
		
		List <String> ListMah=new ArrayList<String>();
		ListMah.add("Thane");
		ListMah.add("Pune");
		
		Set<String> SetGuj=new HashSet<String>();
		SetGuj.add("City1");
		SetGuj.add("City2");
		
		Map <String,List> India=new HashMap<String,List> ();
		India.put("Maharashtra", ListMah);
		System.out.println(India);
		
		Map<String,Set> India1=new HashMap<String, Set>();
		India1.put("Gujarat", SetGuj);
		System.out.println(India1);
		
		Map<List, Set>	m=new HashMap<List, Set>();
		m.put(ListMah, SetGuj);
		System.out.println(m);
		
		
		Collection<Set> values=India1.values();
//		Set<List> Keys=m.keySet();
//		
//		Iterator<List> itr=Keys.iterator();
//		while(itr.hasNext())
//		{											
//			List key1=itr.next();
//			Set val=(Set)m.get(key1);
//			
//			
//			System.out.println(key1);
//			System.out.println(val);
//		}
			Iterator<Entry<List, Set>> itr2=m.entrySet().iterator();
			while(itr2.hasNext())
			{
				Entry<List, Set> s=itr2.next();
				List key=s.getKey();
				Set val=s.getValue();
				System.out.println(key);
				System.out.println(val);	
				
			}
		
		
		
		
//		Map<List, Set>	m1=new HashMap<List, Set>();
//		m1.put(ListMah, SetGuj);
//		//System.out.println(m);
//		
//		for(Map.Entry<List, Set> entry:m1.entrySet())
//		{
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		
//		Iterator<Map.Entry<List, Set>> itr1=m.entrySet().iterator();
//		while (itr1.hasNext()) {
//			Map.Entry<List,Set> entry = (Map.Entry<List,Set>) itr1.next();
//			
//			System.out.println(entry);
//		}
//			
		}
	
}
