package filehandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
public class pgm5 {
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("C:\\Users\\AGEETHIK\\OneDrive - Capgemini\\Documents\\DAY2\\dog.jpg");
		BufferedReader br=new BufferedReader(f);
		String s="";
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
			System.out.println(s);
		}
		
	}

}
