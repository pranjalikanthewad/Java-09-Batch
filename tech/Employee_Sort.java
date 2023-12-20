package com.tech;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


public class Employee_Sort {
	
	public static void main(String[] args) {
		
//		TreeSet<Employee> t=new TreeSet<Employee>();
//		Employee e1=new Employee();
//		e1.seteId(103);
//		e1.seteName("Swara");
//		e1.seteSalary(20000);
//		
//		Employee e2=new Employee();
//		e2.seteId(107);
//		e2.seteName("Amit");
//		e2.seteSalary(35000);
//		
//		Employee e3=new Employee();
//		e3.seteId(105);
//		e3.seteName("Vihan");
//		e3.seteSalary(10000);
//		
//		t.add(e1);
//		t.add(e2);
//		t.add(e3);
//		
//		System.out.println(t);
	
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(102,"Raj",20000));
		l.add(new Employee(109, "Amit", 15000));
		l.add(new Employee(105, "Viraj", 60000));
	 
		
		Comparator<Employee> c=(obj1,obj2)->obj1.geteName().compareTo(obj2.geteName());
		
		//Comparator<Employee> c=(obj1,obj2)->(obj1.geteId()<obj2.geteId())?1;
		Collections.sort(l,c);
		
		
		for (Employee emp : l) 
		{
			System.out.println("\n"+emp.geteId());
			System.out.println(emp.geteName());
			System.out.println(emp.geteSalary());
			System.out.println("*******************");
		}	
		
		
	}
}
