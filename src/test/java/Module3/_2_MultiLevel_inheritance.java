package Module3;

class sriraml{
	public void  m1() { //Only Non static methods can be inherited, static methods cannot be inherited
		                 ////Constructors cannot be inherited because they are not a member of class         
		System.out.println("M1 method");
	}
}

class srinivas extends sriraml{             // One super(parent) and Two sub(child) class
	public void m2() {
		System.out.println("M2 method");
	}
}

class raj extends srinivas{       // in multilevel cls extends previous cls (ex: raj extend srinivas)
	public void m3() {
		System.out.println("M3 method");
	}
}
public class _2_MultiLevel_inheritance {

	public static void main(String[] args) {
		
		raj r=new raj();
		r.m1();
		r.m2();
		r.m3();
	}

}
