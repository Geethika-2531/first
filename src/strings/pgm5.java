package strings;

import java.util.Scanner;

public class pgm5 {
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1.append("java"));
		System.out.println(sb1.capacity());
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=s.next();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
		}
		System.out.println(s2);
		for(int i=s2.length()-1;i>=0;i--)
		{
			System.out.println(s1.charAt(i));
		}
		System.out.println();
		StringBuilder sb=new StringBuilder(s1);
		System.out.println(sb.reverse());
		
	}

}
