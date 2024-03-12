package Module4;

public class _5Finalize {
	
	public void finalize() {
		System.out.println("MY LAP IS DELL COM");
	}
public static void main(String[] args) {
	_5Finalize f = new _5Finalize();  // object
	
	f = null;// f.finalize(); -- we use null also
	
	System.gc(); //Garbage collector - This garbage colector make relation in finaalize method
	                  // this progm garbage collector call the  finalize method and print the statement
}
}
