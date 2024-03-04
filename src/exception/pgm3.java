package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class pgm3 {
	void readData() throws FileNotFoundException
	{
		FileReader f=new FileReader("abc.txt");
	}
	public static void main(String[] args) {
		
	 pgm3 p=new pgm3();
	 try
	 {
		 p.readData();
	 }
	 catch(FileNotFoundException e)
	 {
		 System.out.println("FILE NOT FOUND");
		 System.out.println(e.getStackTrace());
		 e.getStackTrace();
	 }
	}
}
