package filehandling;
import java.io.File;
import java.io.IOException;
public class pgm2 {
	public static void main(String[] args) {
		File f=new File("C:\\hello/abc.txt");
		if(f.exists()==false)
		{
			try
			{
				f.createNewFile();
				System.out.println("file created");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		 }
		else
		{
			System.out.println("file already exist");
		}
	}

}