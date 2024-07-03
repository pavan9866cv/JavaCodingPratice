package com.java.demo1;

public class TavantCmpy_reverseNum {

	public static void main(String[] args) {
		String s = "aaabbccbdde";
		char initial=s.charAt(0);
		String s1="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{ 
			if(i+1==s.length())
			{
				s1=s.charAt(i)+"1";
				break;
			}
			else if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else {
				s1=s.charAt(i)+Integer.toString(count);
				count=0;
			}
		}
		System.out.println(s1);

	}

}
