package com.inheritance;
abstract class vehicle
{
	abstract void start();
	abstract void wheels();
	void color()
	{
		System.out.println("color is black");
	}
}
class car extends vehicle
{
	void start()
	{
		System.out.println("starts with key");
	}
	void wheels()
	{
		System.out.println("starts with kick");
	}
}

public class abstraction {
	public static void main(String[] args)
	{
		car c=new car();
		c.start();
		c.wheels();
		c.color();
	}

}
