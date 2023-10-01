package com.inheritance;
interface I2
{
	public void start();
	
}
interface I3
{
	public void color();
	
}
class car2 implements I2, I3
{
	public void start()
	{
		System.out.println("starts with key");
	}
	public void color()
	{
		System.out.println("black");
	}
}

public class Multiple_inheritance_through_interface {
	public static void main(String[] args)
	{
		car2 c=new car2();
		c.start();
		c.color();
		
	}

}
