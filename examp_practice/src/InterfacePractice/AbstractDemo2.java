package InterfacePractice;

public abstract class AbstractDemo2 {
    public abstract void m1();
    
    // we can write main method inside abstract class
    public static void main(String[] args)
    {
    	// we can not create object for abstract class
    	AbstractDemo2 name = new AbstractDemo2();
    }
}
