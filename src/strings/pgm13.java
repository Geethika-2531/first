package strings;

import java.util.Scanner;

public class pgm13 {
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String st=s.next();
		String st1="";
		char ch[]=st.toCharArray();
		for(int i=0;i<st.length()/2;i++)
		{
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		st1=new String(ch);
		if(st1.equalsIgnoreCase(st))
			System.out.println(st+" is palindrome");
		else
			System.out.println(st+"not palindrome");
}
}
