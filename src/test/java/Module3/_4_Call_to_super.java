package Module3;

class A {
	public A(int i) {
	
		System.out.println("A class"+" "+i);
	}
}

class B extends A{
	public B( ) {
		super(50);
		System.out.println("B class");
	}
}

public class _4_Call_to_super {

	public static void main(String[] args) {
		B b=new B();
	}

}
