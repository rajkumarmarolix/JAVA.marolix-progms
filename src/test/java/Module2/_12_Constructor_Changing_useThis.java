package Module2;

public class _12_Constructor_Changing_useThis {
	
	
	public _12_Constructor_Changing_useThis() {
		this(200); //this- calling one constructor from another constructor 
                                                    //of same class is called as call to this.
		System.out.println("1st changeing");
	}
	
	public _12_Constructor_Changing_useThis(int a) {
		this("raj kumar");
		System.out.println("2nd changeing"+" " + a);
		
	}
	
	public _12_Constructor_Changing_useThis(String name) {
		System.out.println("3rd changeing"+ " "+ name);
		
	}
	
	public static void main(String[] args) {
	_12_Constructor_Changing_useThis cct= new _12_Constructor_Changing_useThis(); //()no need to pass
		                                    // any arguments ,create object once only in constr changing
	}

}
