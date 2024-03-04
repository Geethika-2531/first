package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pgm4 {

	public static void main(String[] args) {
		String Path="c:\\hello/abc.txt";
		File f=new File(Path);
		FileReader fr=null;
		try
		{
			fr=new FileReader(Path);
			int size=(int)f.length();
			System.out.println(f.length());
			char[]c1=new char[size];
			fr.read(c1);
			System.out.println(c1);
			System.out.println("reading data is completed");
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("error in reading file");
			e.printStackTrace();
		}
	}
}
