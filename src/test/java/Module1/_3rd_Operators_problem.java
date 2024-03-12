package Module1;

public class _3rd_Operators_problem {

public static void main(String[] args) {
	int a =10;
	int b = 20;
	System.out.println(a+b); // 1.Arithmetic operators
    System.out.println(b-a);
    
    int i = 10; // 2.Assignment operator 
     System.out.println(i);
    // Whenever we see = operator tell/read in Right to Left
    /*10 is the integer so have to store
      by useing = operator
      in i reference variable
      into a int data type */
                                                  //F11-- (shortcut to run program)
    int c = 10;
    int m = 30; // 3.Comparsion operator		
    System.out.println(a==b); //if value match it returns True otherwise False
    
    int co = 10;
    int n = 30; // 4.Concatination operator		
    System.out.println("comparsion value"+" "+(a==b)); // + " " + using  this to space
    System.out.println("java" + " "+ "program3");
    
    int r = 10;
    int o = 30; // 5.Relational operator
    System.out.println(r>o);
    System.out.println(r<o);
    System.out.println(r>=o);
    System.out.println(r<=o);
    System.out.println(r!=o);
    
    boolean l = true; // 6.Logical operator
    boolean an = false; // a) AND && - This operator both values are same give o/p is true 
    System.out.println(l&& an);  // other wise false
    
    System.out.println(l||an); // b) OR || -This operator ONE value is True give o/p is true
                                  // both values are False- O/P also False
    
    System.out.println(!an); // c) NOT ! -This operator  is Opposite values 
                                     // l=true an= false then we take 'an' value o/p is false
                                             
    
    int inc = 4; // 7.incremental operator
    ++inc;
    System.out.println(inc); //increment means add value 1
    
     int incr = 5;
     incr = ++incr + ++incr;  // a)pre- increment increment value 1+ assign value 
     System.out.println(incr);                       // 1+1+1     +5  = 13 o/p
    
    int rk = 4, k;
    k = ++rk + ++rk; //k = 6 rk =5+6 =11 o/p 6, 11
    System.out.println(rk+" "+ k); 
    
    int d = 4, e, f; // d= 5
    e = ++d + ++d;   //e=6+5=11,
    f = ++e;          //e=11+1 =12, then f=12 because f asign to e 
    System.out.println(d+" "+e+" "+f); // 6,11,12
    
    
    int y= 4;
     y=y++;   // b)post- increment
     System.out.println(y); // whever use assignment operator in post increment 
                           //that take default value  y=y++
    
    
     int z= 4;
     z=z++ + z++; // z= 4+5=9 // in second z++ not assigned thats why add 1
     System.out.println(z);
    
    
    //OWN:- (PRE & POST DECrement
     int decr = 5;
     decr = --decr;  // a)pre- decrement decrease value -1
     System.out.println(decr);                       
    
     int A=55; //55-1=54
     int B,C;
      B= --A; // 54-1=53
      C= B--;
    System.out.println(A+" "+B+" "+C);
    
    
    
    
	}

}
