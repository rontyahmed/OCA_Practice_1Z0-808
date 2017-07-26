package Inheritance;

class Parent {
	Parent() {
		System.out.println("parent constructor");
	}
}

public class InheritanceDemo1 extends Parent {

	InheritanceDemo1() {
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		InheritanceDemo1 demo = new InheritanceDemo1();
	}

}
