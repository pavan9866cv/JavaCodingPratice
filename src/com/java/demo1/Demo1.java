package com.java.demo1;

public class Demo1 {
	public static void main(String[] args)
	{
		System.out.println("Hi");
		Student s=new Student();
		
		Teacher t= new Teacher();
		t.printValue();
		
		Student s1= new Teacher();
	
		
		
		
	}

}
 class Student{
	
	private void printValue()
	{
		System.out.println("from student");
	}
}
class Teacher extends Student{
	
	void printValue()
	{
		System.out.println("from Teacher");
	}
}


