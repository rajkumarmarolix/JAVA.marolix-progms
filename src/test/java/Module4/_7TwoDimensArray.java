package Module4;

public class _7TwoDimensArray {
	public static void main(String[] args) {

	int a[][] = new int[2][4];
	a[0][0]=10;
	a[0][1]=20;
	a[0][2]=30;
	a[0][3]=50;
	
	a[1][0]=100;
	a[1][1]=200;
	a[1][2]=250;
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