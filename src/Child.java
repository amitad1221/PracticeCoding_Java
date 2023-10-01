
public class Child extends Parent {
	void m2()
	{
		System.out.println("child class");
	}
	
	

}
class Test
{
	 public static void main(String[] args)
	 {
		 Child c=new Child();
		 c.m1();
		 c.m2();
	 }
	 
}
