package Module3;

public class _7_Widening {  //w is also called Implicit Casting.


	public static void main(String[] args) {
		byte b= 12;
		//widening  -- Converting smaller primitive datatype into bigger primitive datatype 
		short s= b;
		int i = s; 
		long l = i;
		float f =l;
		double d=f;
		
		//System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}

}
