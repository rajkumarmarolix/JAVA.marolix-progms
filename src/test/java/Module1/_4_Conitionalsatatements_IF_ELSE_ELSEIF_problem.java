package Module1;

public class _4_Conitionalsatatements_IF_ELSE_ELSEIF_problem {

	public static void main(String[] args) {
		int a=10;
		
		if (a % 2 == 0)  //10%2==0  10%2 divided by 2 remainder 0 thats why even nymber
		{
			System.out.println("Even number");
		}
		else {
		System.out.println("Not Even number");
		}

		
		//Type-2 (If, Elseif, Else)
		
       int A=11;		
		if (A % 2 == 0)  //11%2==0  11%2  not didvided by 2 thats why odd nymber
		{
			System.out.println("Even number");
		}
		else if(A%2!=0)                          
     	{
		System.out.println("odd number");
		}
		else {                                        // both are not equal print this
			System.out.println("Not Even or odd number");
		}
		
	
		
		

		
	}

}
