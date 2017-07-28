package InterfacePractice;

public abstract class AbstractDemo1 {
  
	  public abstract void m1();
	  
	  public static void main(String[] args)
	  {
		  AbstractDemo1 name = new demo();
		  name.m1();
		  demo d=(demo)name;
		  d.m2();
	  }
}
class demo extends AbstractDemo1
{
   public void m2()
    {
    	System.out.println("m2 invoked");
    }
	public void m1() {
      System.out.println("method invoked");		
	}
	
}
