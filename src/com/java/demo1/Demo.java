package com.java.demo1;

public class Demo {
	
	public static void main(String[] args)
	{
		byte x=127;// byte holds value from -128 to 127
		x++;
		x++;
		System.out.println(x);
		// for above.. byte code type is an 8-bit signed two's complement integer, which means it 
//		can hold values from -128 to 127.
//		when u increment value of x by 1(x++), it goes from 127 to -128 bcz of overflow.
//		overflow occurs wen a value exceeds maximum value that can be represented in given data Type.
//		so x++ takes from 127 to -128, and then another x++ takes it from -128 to -127. when you print the value
//		of x, it will be -127.
		
		
	}

}
