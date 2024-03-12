package Module4;

public class _2Throws {
	public static void m1() throws ArithmeticException{
		m2();
		System.out.println("raj");
		
			int a= 10;
			int b= 0;
			int c = a/b;
			System.out.println(c);	
	}
 public static void m2() throws ArithmeticException{ // throws allways throws the Exception not catch the
	                                                          //exception thats why use try and catch
	 System.out.println("kumar");
		System.out.println("adapa");
		 
 }
 public static void main(String[] args) throws ArithmeticException {
	m1();
	m2();
}
}
