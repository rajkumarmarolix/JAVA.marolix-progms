package Module2;

public class _5_Glodal_Variable {
	
	static float f; // static varivable
// Non-static varivables
	char cg ='G';
	int t= 10;

	public  void m(int age, String add) {
		System.out.println("Rk"+" "+age+" "+add+" "+f); //"float" give static value into nonstatic method
	                                        // no need to create any object
	}	
	
	public static void m1() {
		int t =10;
_5_Glodal_Variable gvp = new _5_Glodal_Variable();  //- object
		System.out.println("ds"+" "+t+" "+gvp.cg); //give Non-static value into static method ---IMP
                                                      // to create a object
	}
	

public static void main(String[] args) {
	_5_Glodal_Variable gvp =	new _5_Glodal_Variable();
	gvp.m(24, "Tnk");
	m1();
}
}