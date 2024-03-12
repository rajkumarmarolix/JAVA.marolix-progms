package Module4;

public class _1EXCEPTION {
public static void main(String[] args) {
	System.out.println("Raj kumar");
	System.out.println("25 years");
	try {                           // to handle or catch the exception use this try and catch
		int a = 10;
		int b= 0;
		int c =a/b;
		System.out.println(c);
		
	} catch (Throwable ae) {
		
		System.out.println("rkumar");
		System.out.println("marolix Tech");
		
		ae.printStackTrace(); // use this get know what type of Exception ex:java.lang.ArithmeticException
		
		System.out.println(ae.getMessage()); //use this get know why Exception happen ex:/ by zero
	}
	
	finally {
		System.out.println("raj kumar adapa");
	}
	
	
	
	
	
	
	
}
}
