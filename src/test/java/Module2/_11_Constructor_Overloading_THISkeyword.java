package Module2;

public class _11_Constructor_Overloading_THISkeyword {

	String name;   //this- calling one constructor from another constructor 
                                                       //of same class is called as call to this.
	int age;
	float f;
	
	public _11_Constructor_Overloading_THISkeyword(String name) {
		
		this.name= name;  //this- Argment and actual variable both same that time use this keywor
		                                   
	}
	
  public _11_Constructor_Overloading_THISkeyword(int num) {
	  age= num;
		
	}
	
  public _11_Constructor_Overloading_THISkeyword(float f) {
	this.f = f; 
    }
  
	public static void main(String[] args) {
   _11_Constructor_Overloading_THISkeyword cot= new _11_Constructor_Overloading_THISkeyword("rk");
		System.out.println(cot.name);
			
   _11_Constructor_Overloading_THISkeyword cot1= new _11_Constructor_Overloading_THISkeyword(24);
		System.out.println(cot1.age);
			
	_11_Constructor_Overloading_THISkeyword cot2= new _11_Constructor_Overloading_THISkeyword(63.4f);
		System.out.println(cot2.f);
		
		
		

	}

}
