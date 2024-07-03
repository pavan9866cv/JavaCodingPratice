package com.java.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample4 {
	public static void main(String[] args)
	{
		int arr[]= {1,2,3};
		int k=5;
		int temp=0;
		List<Integer> list= new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			temp=k+temp+arr[i];
			list.add(temp);
			System.out.println(temp);
		}
		List<Integer> list1= Arrays.asList(1,2,3);
		list1.stream().forEach(a->System.out.println(getElement(a)));
	}
	static int getElement(int a)
	{
		int k=5;
		int temp=0;
		temp=k+temp+a;
		
		return temp;
	}

}
