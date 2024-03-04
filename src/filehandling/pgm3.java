package filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class pgm3 {
	public static void main(String[] args) {
		try
		{
			FileWriter f=new FileWriter("c:\\hello/abc.txt");
			f.write("hi how r u");
			f.flush();
			System.out.println("writing data is completed");
		}
		catch(IOException e)
		{
			System.out.println("Error in printing the data");
			e.printStackTrace();
		}
	}
}
