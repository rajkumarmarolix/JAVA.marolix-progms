package Module3;

public class _8_Narrowing { //Converting bigger primitive datatype into smaller primitive datatype

	public static void main(String[] args) {
		
		double d=140.45; 
		 float f=(float) d;
		 long l=(long) f; 
		 int i=(int) l; 
		 short s=(short) i; 
		 System.out.println(d); 
		 System.out.println(f); 
		 System.out.println(l); 
		 System.out.println(i); 
		 System.out.println(s);
	}

}
