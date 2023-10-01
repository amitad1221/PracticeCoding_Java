package com.inheritance;
class Parent1
{
	void property()
	{
		System.out.println("land+cash");
	}
	void marry()
	{
		System.out.println("s");
	}
}
class Child1 extends Parent1
{
	void marry()
	{
		System.out.println("B");
	}
}

public class Overriding {
	public static void main(String[] args)
	{
		Child1 c=new Child1();
		c.property();
		c.marry();
	}

}
