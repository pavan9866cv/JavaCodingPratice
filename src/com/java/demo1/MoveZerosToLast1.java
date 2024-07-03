package com.java.demo1;

public class MoveZerosToLast1 {
	
	public static void main(String[] args)
	{
		int arr[]= {0,0,0,3,4,0,2,0,0,99};
		int nonZeroIndex=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				if(i!=nonZeroIndex)
				{
					int temp=arr[i];
					arr[i]=arr[nonZeroIndex];
					arr[nonZeroIndex]=temp;
				}
				nonZeroIndex++;
			}
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}

}
