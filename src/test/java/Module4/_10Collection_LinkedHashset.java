package Module4;

import java.util.LinkedHashSet;

public class _10Collection_LinkedHashset {
	public static void main(String[] args) {
		
	LinkedHashSet<String> lh =new LinkedHashSet<String>();
		
		
		lh.add("fgh");
		lh.add("fgh");  //in this linkedhashset duplicate values are not allowed
		lh.add("fgh");                       //it takes but not executed.
		lh.add("mt");
		lh.add("rk");
		
		System.out.println(lh);
		System.out.println(lh.size());
		for( String data : lh) {
			if (data.equals("rk")) {
				System.out.println(data);
			}
			
		}
		
	/*	LinkedHashSet<Integer> lh =new LinkedHashSet<Integer>();
		lh.add(239);
		lh.add("fgh");
		lh.add("fgh");  //in this linkedhashset duplicate values are not allowed
		lh.add("fgh");                       //it takes but not executed.
		lh.add(678);
		lh.add("rk");               // own
		
		System.out.println(lh);
		System.out.println(lh.size());
                                           */
		
		
	}

}
