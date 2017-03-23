import java.util.*;
import java.lang.*;
import java.io.*;

class ass1
{
public static void main(String[] args)
	{  
	System.out.println("Enter the two numbers");
	Scanner in = new Scanner(System.in);

	int a = in.nextInt();
	int b = in.nextInt();
        while (b != 0)
	{
            int carry = (a & b) ; 
          
            a = a ^ b; 
          
            b = carry << 1; 
        }
        //return a;
	System.out.println("The sum done without + operator : " + b + a);	
} 
}

