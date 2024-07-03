package com.java.demo1;

import java.util.ArrayList;
import java.util.List;

public class MoveZerosTolast {
	public static void main(String[] args) {
		
		int arr[]= {1,0,3,4,0,6,0,8};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		List<Integer> list= new ArrayList<>();
		for(int a:arr)
		{
			if(a!=0)
			{
				list.add(a);
			}
		}
		while(count!=0)
		{
			list.add(0);
			count--;
		}
		System.out.println(list);
	}

}
