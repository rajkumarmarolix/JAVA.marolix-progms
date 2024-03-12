package Module3;

class e {
	public void m1() {
		System.out.println("m1 method");
	}
 
}
class f extends e{
	public void m2() {
		System.out.println("m2 method");
	}
	
}

public class _5_UPcasting { // Converting sub class object type into super class object type is 
	                                                             //called as upcasting. 

	public static void main(String[] args) {
		e upb= new f();  //During up-casting only super class behaviour is visible, sub class 
		    upb.m1();                                                           //behavior is hidden. 
		
	}

}
