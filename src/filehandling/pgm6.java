package filehandling;
	import java.io.FileInputStream;
	import java.io.*;
	public class pgm6 {
	      public static void main(String[] args) throws IOException{
			FileInputStream fis=new FileInputStream("C:\\Users\\AGEETHIK\\OneDrive - Capgemini\\Documents\\DAY2\\dog.jpg");
			int i=fis.read();
			while(i!=-1)
			{
				System.out.println((char)i);
				i=fis.read();
			}
		}
	}

