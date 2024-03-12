package Module2;

public class _6_MethodOverloading {
	
	 //developing multiple methods with Same Name different arguments
		
  public  void m1( String s ,long k) {    //argumrnts--string s, long k, char ch these are argemts
	  System.out.println(s+" "+k);
		
	}
	
  public static void m1( char ch) {
	 // int i;
	 // i =20;
	 
	  System.out.println(ch);
	
    }
	

	public static void main(String[] args) {
		_6_MethodOverloading movl = new _6_MethodOverloading();
		movl.m1("raj", 1234576890);
		m1('r');
	}

}
