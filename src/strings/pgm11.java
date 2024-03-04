package strings;

import java.util.Scanner;
public class pgm11 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String st=s.nextLine();
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65&&ch[i]<=90)
			{
				ch[i]=(char)(ch[i]+32);
				
			}
			else if(ch[i]>=97&&ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		st=new String(ch);
		System.out.println(st);
	}

}
