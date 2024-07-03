package com.java.demo1;

public class StringProblem1 {
	public static void main(String[] args)
	{
		String str="aabbabbcdde"; //a2b3c1d2e1 like this it should print
		
		
		int count=1;
		char c=str.charAt(0);
		//StringProblem1 sP= new StringProblem1();
		String outPut=stringCount(c,str,count);
		
		System.out.println(outPut);
		
		
	}
	static String stringCount(char c,String str,int count)
	{
		String s="";
		for(int i=1;i<=str.length();i++)
		{
			
			if(i==str.length())
			{
				s=s+c+count;
				break;
			}
			if(str.charAt(i)==c)
			{
				count++;
			}
			else {
				s=s+c+count;
				c=str.charAt(i);
				count=1;
				
			}
			
		}
		return s;
	}

}
