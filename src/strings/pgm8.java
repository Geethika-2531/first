package strings;

import java.util.Scanner;
	public class pgm8{
	    public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter a string");
			String s1=s.next();
			int ucase=0;
			int lcase=0;
			int num=0;
			int splchar=0;
			for(int i=0;i<s1.length();i++) {
				char ch=s1.charAt(i);
				if(ch>='A'&&ch<='Z')
					ucase++;
				else if(ch>='a'&&ch<='z')
					lcase++;
				else if(ch>='0'&&ch<='9')
					num++;
				else
					splchar++;
			}
			if(s1.length()>=8&&ucase>0&&lcase>0&&num>0&&splchar>0)
				System.out.println("entered valid password");
			else
				System.out.println("entered invalid password");
}
}