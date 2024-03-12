package Module2;

public class _7_Methodwith_Returntype {
	
	
	public static int m1() {
		System.out.println("raj kumar");
		return   20; // after return statement cannot executed if we write its display error
	}
	
	public String m2() {
		System.out.println("returnprogram");
		return "marolix";
	}

	public static void main(String[] args) {
		int a=m1();
		System.out.println(a);
		
		_7_Methodwith_Returntype mr= new _7_Methodwith_Returntype();
		String s=mr.m2();
		System.out.println(s);
		
		
	}

}
