package Module2;

public class _4_Static_NonStatic {
	
	//Static program
	public static void m() {
		int k= 5;
		System.out.println(k);
	}
	public static void m1() {
		String s= "static program";
		System.out.println(s);
	}
	
	
	//NON-Static program
     public void m2() {
    	  char ch='r';
    	  int a =15;
    	 System.out.println('r'+" "+a);
    	  }
      
	public static void main(String[] args) {
   //Static_NonStatic_4proble snsp= new Static_NonStatic_4proble(); -- we can give this line & below the method  also
      m();                                             // give above two nonstatic is there we write only once no issue
      m1();
      
    _4_Static_NonStatic snsp= new _4_Static_NonStatic();  //-- object - New keyword then give constructor name(cls name)
      snsp.m2();                  //then store the all thins in a  ref variable by useing = assignment operator then give
	}                                    // return type as class name

}
