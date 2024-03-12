package Module4;

public class _6SingleDimensArray {
	public static void main(String[] args) {
		int a[]= new int[5] ;  // In this Array concpt use / take the data in excel sheet
		a[0]=10;
		a[1]=20;      // a  is ref var
		a[2]=30;     // 0,1,2 this are columns
		a[3]=40;     // 10,20,30 this are Rows(size)
		a[4]=50;
		System.out.println(a.length); // use this to knows the Row(size ) ex:5
		System.out.println(a[3]);
		System.out.println("-------");
		
		for(int k= 0; k<a.length; k++) { // print all the data at same time use foe loop
			System.out.println(a[k]);
		}
		
		
	}

}
