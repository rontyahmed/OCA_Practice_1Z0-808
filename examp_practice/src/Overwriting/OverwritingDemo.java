package Overwriting;

class A
{
	
}
class B extends A
{
	public A dummy()
	{
		System.out.println("dummy");
		return new A();
	}
}
public class OverwritingDemo extends B{

	public B dummy()
	{
		return new B();
	}
	public static void main(String[] args) {

	}

}
