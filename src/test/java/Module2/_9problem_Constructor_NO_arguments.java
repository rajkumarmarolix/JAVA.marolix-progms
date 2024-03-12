package Module2;

public class _9problem_Constructor_NO_arguments {

	String name;
	String nam;
	
	
	public _9problem_Constructor_NO_arguments() { // 1.Constructor cannot be static, non static, final or abstract,
		                                       //2.does not give any return type int, string  even void also
		   name = "Raj kumar";                 //3.Constructor can be give  with arguments or without arguments.
		                                       //4.Constructor name must be same as that of classname.
	}
	
	public void Constructor_NO_arguments_9problem() {
		nam="rk";
	}

	public static void main(String[] args) {
		 _9problem_Constructor_NO_arguments cna	= new  _9problem_Constructor_NO_arguments();
		    System.out.println(cna.name);

	}

}
 //drawbacks of no argument constructor is, it provides same value for every object.
