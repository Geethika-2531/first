package strings;

import java.util.Scanner;

public class pgm12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String st=s.nextLine();
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U')
			{
				count++;
				System.out.println(st.charAt(i));
			}
		}
		System.out.println("num of vowels present is:"+count);
	}
}
