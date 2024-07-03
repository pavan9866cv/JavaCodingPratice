package com.java.demo1;

public class MinMax {
	
	public static void main(String[] args)
	{
		int arr[]= {21,1,12,3,43,11};
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		for(int i=1;i<arr.length;i++)
		{
			if(max>arr[i])
			{
				min=arr[i];
			}
		}
	}

}
