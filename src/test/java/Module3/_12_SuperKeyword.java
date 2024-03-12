package Module3;

class Telecom {
	public void callertune() {
		System.out.println("Default tone");
	}
	
}
 class customer extends Telecom{
	 public void callertune() {
		 System.out.println("customized tone");
	 }
    public void setting() {
	 callertune();
	 super.callertune();
    }
 }


public class _12_SuperKeyword {  //it is used to call super class instance members(non satic variables and non static methods)
	
	                                         //• it is used in sub class non static methods.
public static void main(String[] args) {
  customer  cu = new customer();
  cu.setting();
}
}
