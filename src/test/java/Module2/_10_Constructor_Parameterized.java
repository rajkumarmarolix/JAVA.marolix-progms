package Module2;

public class _10_Constructor_Parameterized {

	int age;
	
	public _10_Constructor_Parameterized (int num){  // (int num) assign this arg ment varible to
		                                                          //int age; this actual variable
		                                   //Constructor name must be same as that of classname
		age = num;
	}
	
	public static void main(String[] args) {
		
		_10_Constructor_Parameterized cp	= new _10_Constructor_Parameterized(24);
		System.out.println(cp.age);
		
		_10_Constructor_Parameterized cp1	= new _10_Constructor_Parameterized(27);
		System.out.println(cp1.age);
	}

}