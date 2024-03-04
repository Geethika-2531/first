package exception;

import java.util.Scanner;

class InvalidiDException extends RuntimeException{
	
}
class InvalidPasswordException extends RuntimeException{
	
}
public class pgm5 {
	
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a name");
	String name=s.next();
	System.out.println("enter a password");
	int pwd=s.nextInt();
	if(name.equalsIgnoreCase("Smith"))
	{
		if(pwd==12345)
		{
			System.out.println("login successful");
		}
		else
		{
			try
			{
				InvalidPasswordException i= new InvalidPasswordException();
				throw i;
			}
			catch(InvalidPasswordException e)
			{
				System.out.println("Invalid password");
			}
			
		}
}
	else
	{
		try
		{
			throw new InvalidiDException();
		}
		catch(InvalidiDException e)
		{
			System.out.println("invalid id");
		}
	}
		
	}

}
