package Module3;

class  Ramanaidu{
	public void  m1() { //Only Non static methods can be inherited, static methods cannot be inherited
		                          
		System.out.println("M1 method");
	}
	public void m2() {
		System.out.println("M2 method");
	}
}

class sureshbabu extends Ramanaidu{             // One super(parent) and Two sub(child) class
	public void m3() {
		System.out.println("M3 method");
	}
	public void m4() {
		System.out.println("M4 method");
	}

}

class venkatesh extends Ramanaidu{  // in Hierarchical cls extends Super class not previous cls (ex: venkatesh extend ramanaidu)
	public void m5() {
		System.out.println("M5 method");
	}
	public void m6() {
		System.out.println("M6 method");
	}
}
public class _3_Hierarchical {

	public static void main(String[] args) {
		
		Ramanaidu rn= new Ramanaidu();
		rn.m1();
		rn.m2();
		System.out.println("----------------------");
		
		sureshbabu sb= new sureshbabu();
		sb.m1();
		sb.m2();
		sb.m3();
		sb.m4();
		System.out.println("------------------------");
		
		venkatesh v= new venkatesh();
		 v.m1();
		 v.m2();
		 v.m5();
		 v.m6();
		 System.out.println("------------------------");
	}

}
