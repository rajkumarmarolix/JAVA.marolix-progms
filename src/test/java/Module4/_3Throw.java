package Module4;

public class _3Throw {
	public static void main(String[] args) {
		try {
			throw new Exception("Raj kumar exception"); //throw keyword is used to create Exception 
		} catch (Exception e) {
			e.printStackTrace(); //Track the Exception
			System.out.println(e.getMessage()); //Print the Exceptoon
			
		}
	}

}
