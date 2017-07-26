package MethodPractice;

public class PassByReference3 {

	public static void main(String[] args) {
       Test t=new Test();
       t.name="crescent";
       System.out.println("before methode invoke"+t.name);
       m2(t);
       System.out.println("after method invoke"+t.name);
	}
	public static void m2(Test t1)
	{
		t1.name="bsa";
	}

}
class Test
{
    String name;
    
}
