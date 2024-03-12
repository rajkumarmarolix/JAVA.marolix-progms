package Module2;

public class _1_Methods_withoutargmemnt {
	
	
	public static void m1() { //()method without arguments
		m3();  //we can use method in after main method and cls level also
		System.out.println("raj");
	}
	
	public static void m2() {
	//  m2(); // we cant use same method in same method cls level
		System.out.println("kumar");
	}
	
	public static void m3() {
		System.out.println("marolix");
	}
	
	
	
public static void main(String[] args) {
		m1();
		m1(); // we can methods no of times
		m2();
		m3();
	}

}
