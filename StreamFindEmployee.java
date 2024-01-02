package com.assign;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFindEmployee {

	public static void main(String[] args) {
		
		
		List<EmployeeSortData> al=new ArrayList<EmployeeSortData>();
		
		EmployeeSortData e1=new EmployeeSortData();
		e1.seteId(105);
		e1.seteName("Sachin");
		
		EmployeeSortData e2=new EmployeeSortData();
		e2.seteId(108);
		e2.seteName("Amol");
		
		EmployeeSortData e3=new EmployeeSortData();
		e3.seteId(101);
		e3.seteName("Mahesh");
		
		EmployeeSortData e4=new EmployeeSortData();
		e4.seteId(106);
		e4.seteName("Mahesh");
		
		EmployeeSortData e5=new EmployeeSortData();
		e5.seteId(102);
		e5.seteName("Ram");
		
		EmployeeSortData e6=new EmployeeSortData();
		e6.seteId(104);
		e6.seteName("Rahul");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		
		//System.out.println(al);
		//List<EmployeeSortData> list = al.stream().sorted((i1,i2)-> i1.geteName().compareTo(i2.geteName())).collect(Collectors.toList());
		
		List<EmployeeSortData> list = al.stream().filter((s)-> s.eName.contains("Rahul")).collect(Collectors.toList());
		
		//System.out.println(list);
	
		for (EmployeeSortData emp : list) 
		{
			System.out.println("\n"+emp.geteId());
			System.out.println(emp.geteName());
			System.out.println("*******************");
		}	
//		
		
	}
	
	
}
