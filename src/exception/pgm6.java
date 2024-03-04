package exception;

import java.util.Scanner;

class AgeInvalidException extends Exception
{
	private String message;

public AgeInvalidException(String message)
{
	this.message=message;
}
@Override
public String getMessage()
{
	return message;
}
}
public class pgm6 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		int age=s.nextInt();
		if(age>=18)
		{
			System.out.println("get your DL");
		}
		else {
			try
			{
				throw new AgeInvalidException("not 18 yet");
			}
			catch(AgeInvalidException e)
			{
				System.out.println(e.getMessage());
			}
		}
			
	}
}
