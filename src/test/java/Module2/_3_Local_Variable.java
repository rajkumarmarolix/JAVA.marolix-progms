package Module2;

public class _3_Local_Variable {
	
	
	public static void m1() {
		int k=10;  // Declare variable in side method & inside scope of class
		
		   k=30; //Local Variable access only within method
		  
		System.out.println(k);
	}
	public static void m2() {
		//k=30 // Local Variable Not Access Out side  any other method
		String name="rk";
		System.out.println(name);
	}
	public static void m3() {
		int r;
		r=80;  // in this Local variablr Variable Intialisation is mandatory 
		 System.out.println(r);                                           //other get exception
	}
	public static void main(String[] args) {
		m1();
		m2();
		m3();
	}

}
