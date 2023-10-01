package com.inheritance;

public class Overloading {
	void m1()
	{
		System.out.println("void type");
	}
	void m1(int i)
	{
		System.out.println("int type");
	}
	void m1(String s)
	{
		System.out.println("string type");
	}
	public static void main(String[] args)
	{
		Overloading o=new Overloading();
		o.m1("s");
	}

}
