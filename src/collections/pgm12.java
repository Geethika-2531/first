package collections;

import java.util.*;

public class pgm12 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Start");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number A");
		int a=s.nextInt();
		System.out.println("Enter number B");
		int b=s.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero ");
		}
		System.out.println("Main end");
	}

}
