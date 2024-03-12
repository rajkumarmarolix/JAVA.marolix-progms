package Module4;

public class _8TwoDimensArray_useing_Object {
	public static void main(String[] args) {
		
		Object a[][] = new Object[2][4];
		
		a[0][0]=10;
		a[0][1]="raj";   //Array stores only homogeneous data i.e, in integer array we can add 
	   	                  //only integer data, if we add any other type of data we wil get compile  time error.
		                       // that time we create a object  to use it
		a[0][2]=30;
		a[0][3]=50;
		
		a[1][0]=100;
		a[1][1]=200;
		a[1][2]="rk";
		a[1][3]=300;
		
		
		
		System.out.println(a.length); //row size
		System.out.println(a[0].length);  //column 
		System.out.println(a[0][3]);
		System.out.println(a[1][2]);
		
		for(int r = 0; r<a.length; r++) {
			for(int c =0; c<a[0].length; c++) {
				System.out.println(a[r][c]);
				
	}

}
	}
}
