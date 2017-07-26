package MethodPractice;

public class PassByValue {

	public static void main(String[] args) {
      int a=100;
      int b=200;
      m1(a,b);
      System.out.println("in main method "+"a "+a+" "+"b "+b);
	}
	public static void m1(int a,int b)
	{
		a=10;
		b=20;
		System.out.println("in invoked method "+"a "+a+" "+"b "+b);
	}

}
