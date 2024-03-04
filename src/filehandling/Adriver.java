package filehandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class Adriver {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		account a=new account(1,1234,555);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\AGEETHIK\\OneDrive - Capgemini\\Documents\\DAY2\\dog.jpg",false);
		PrintWriter pw=new PrintWriter(fos);
		pw.print("Account no: ");
		pw.println(a.acc_no);
		pw.print("Available balance: ");
		pw.println(a.balance);
		boolean exit=true;
		while(exit)
		{
			System.out.println("1. Withdrawl");
			System.out.println("2. Deposite");
			System.out.println("enter your option");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter pwd");
				int pwd=sc.nextInt();
				System.out.println("Enter amount");
				double amount=sc.nextDouble();
				double wdStatus=a.withDrawal(pwd, amount);
				if(wdStatus==-1)
					System.out.println("Insufficient fund");
				else if(wdStatus==0)
					System.out.println("invalid pwd");
				else
				{
					System.out.println("Transaction of Amount"+wdStatus+" is Successful");
					pw.print("---------------");
					pw.print("Amount debited:");
					pw.println(wdStatus);
					pw.print("Available balance");
					pw.println(a.balance);
					pw.flush();
				}
			}
			
		}
		
		
	}

}
