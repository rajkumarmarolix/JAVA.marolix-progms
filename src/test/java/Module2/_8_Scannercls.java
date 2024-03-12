package Module2;
import java.util.Scanner;

public class _8_Scannercls {
public static void main(String[] args) {
		
	Scanner s= new Scanner(System.in);
	
	   System.out.println("Enter name");
	   String name=s.nextLine();
	   System.out.println(name);
	   
	   System.out.println("Enter age");
	   int age=s.nextInt();
	   System.out.println(age);
	   
	   System.out.println("Enter percentage");
	   float percentage=s.nextFloat();
	   System.out.println(percentage);   
	   
	   System.out.println("Enter result");
	   boolean result=s.nextBoolean();
	   System.out.println(result);
	   
	   System.out.println("Enter phno");
	   long contact=s.nextLong();
	   System.out.println(contact);
	   
	   System.out.println("Gender");
	  char gender=s.next().charAt(0);
	 System.out.println(gender);
	   
	   
	
	
	
	
	}

}
