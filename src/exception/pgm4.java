package exception;

import java.util.Scanner;
class InsufficientBalanceException extends Exception{
}

class pgm4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int balance=5000;
		System.out.println("enter a amount");
		int amt=s.nextInt();
		if(amt<=balance)
		{
			System.out.println("withdraw successful");
		}
		else
		{
			try
			{
				InsufficientBalanceException i=new InsufficientBalanceException();
				throw i;
			}
			catch(exception.InsufficientBalanceException e)
			{
				System.out.println("not enough balance");
			}
		}
	}

}

