package Module3;

class u{
	public void m1() {  //MethodOverriding jvm take super cls properities(m1) 
		System.out.println("m1-u method");                     //but giving sub cls m1 implementation
	}
	public void m2(int a) {
		System.out.println("m2-u method"+" "+a);
	}
}

class v extends u{
	public void m1() {
		System.out.println("m1-v method");
	}
	public void m2(int a) {
		System.out.println("m2-v method"+" "+a);
		
	}
}


public class _9_MethodOverriding {

	public static void main(String[] args) {
		u you= new v(); //object--subcls ref = newkeyword supercls()
		you.m1();
		you.m2(55);
		
	}

}
