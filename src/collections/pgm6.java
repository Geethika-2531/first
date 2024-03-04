package collections;//foreach loop for arrays
import java.util.*;
public class pgm6 {
	public static void main(String[] args) {
		
		int a[]= {10,20,30};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			System.out.println("----------");
			for(int i:a)
			{
				System.out.println(i);
			}
			System.out.println("----");
			double d[]= {1,2,3,4,5};
			for(double e:d)
			{
				System.out.println(e);
			}
			System.out.println("-----------");
			String[]name= {"geet","geethu","geethika"};
			for(String s:name)
			{
				System.out.println(s);
			}
}
}