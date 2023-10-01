package com.inheritance;

class Parent {
	 
	void m1()
	{
		System.out.println("parent class");
	}
	
	
}
 class Child extends Parent
{
	void m2()
	{
		System.out.println("child class");
	}
	 
}
 class Inheritance1
 {
	 public static void main(String[] args)
	 {
		 Child c=new Child();
		 c.m1();
		 c.m2();
	 }
	 
 }
