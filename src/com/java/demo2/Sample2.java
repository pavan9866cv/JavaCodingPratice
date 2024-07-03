package com.java.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample2 {
	
	public static void main(String[] args)
	{
		Employee e1= new Employee(1,"Pavan","Male");
		Employee e2= new Employee(2,"Sai","Male");
		Employee e3=new Employee(3,"hari","Female");
		Employee e= new Employee();
		Map<String, Integer> map= new HashMap<>();
		List<Employee> list= new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		int maleCount=(int) list.stream().filter(a->a.getGender().matches("Male")).count();
		int femaleCount=(int) list.stream().filter(e4->e4.getGender().matches("Female")).count();
		System.out.println("Male Emp: "+maleCount);
		System.out.println("Female Emp: "+femaleCount);
		map.put("Male", maleCount);
		map.put("Female", femaleCount);
		
		for(Map.Entry<String, Integer> employ: map.entrySet())
		{
			System.out.println(employ.toString());
		}
		System.out.println(map.toString());
		
		List<Integer> list1=Arrays.asList(4,5,6,7,1,2,3);
		List<Integer> list2= list1.stream().map(a->a*a*a).filter(b->(b>50)).collect(Collectors.toList());
		System.out.println(list2);
		int secondLargest= list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("secondLargest: "+secondLargest);
		List<String> list3= list.stream().map(Employee::getName).collect(Collectors.toList());
		 
		list.stream().forEach(n->System.out.println(n.getName()));
		
		Integer list4= list1.stream().reduce((a,b)->a*b).get();
		System.out.println(list4 );
		
		
		
		
		
		
	}

}
