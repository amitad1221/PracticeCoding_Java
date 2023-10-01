package com.inheritance;
interface I1
{
	public void start();
	public void wheels();
	
}
class car1 implements I1
{
	public void start()
	{
		System.out.println("starts with key");
	}
	public void wheels()
	{
		System.out.println("it has 4 wheels");
	}
}

public class Interface {
	public static void main(String[] args)
	{
		car1 c=new car1();
		c.start();
		c.wheels();
		
	}

}
