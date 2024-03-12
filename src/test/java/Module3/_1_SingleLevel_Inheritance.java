package Module3;

class apple{
	public void  m1() { //Only Non static methods can be inherited, static methods cannot be inherited
		                  //Constructors cannot be inherited because they are not a member of class,
		        
	System.out.println("M1 method");
	}
}

class boll extends apple{         // one super(parent) and one sub(child) class
	public void m2() {
		System.out.println("M2 method");
	}
}


public class _1_SingleLevel_Inheritance {

	public static void main(String[] args) {
		apple a1= new apple(); // create Object of super class, we can access only super class methods                  
		a1.m1();
		
		boll b1= new boll(); //create Object of sub class, we can access both super and sub class properties.
		b1.m1();
		b1.m2();
	}

}
