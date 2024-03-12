package Module3;

class x{
	public void m1() {
		System.out.println("M1 METHOD");
	}
}
class y extends x{
	public void m2() {
		System.out.println("M2 METHOD");
	}
}

public class _6_Downcasting {  //• Converting a super class object type into sub class object type is
	                                                                        //called as downcasting

	public static void main(String[] args) {
		 x dc = new y(); // in downcasting create upcasting obj also inthat ref to create downc obj
    	y dc2= (y)dc; //:during upcasting some properties are hidden, during downcasting all 
    	   dc2.m1();                                                       //properties are visible.
    	   dc2.m2();
	
	}
	

}
