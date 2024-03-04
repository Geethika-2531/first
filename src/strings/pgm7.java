package strings;

import java.util.Scanner;

public class pgm7 {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=s.next();
		int uppercase=0;
		int lowercase=0;
		int number=0;
		int splchar=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
				uppercase++;
			else if(ch>='a'&&ch<='z')
				lowercase++;
			else if(ch>='0'&&ch<='9')
				number++;
			else
				splchar++;
		}
		System.out.println("number of uppercase is: "+uppercase);
		System.out.println("number of lowercase is: "+lowercase);
		System.out.println("number of  numbers is: "+number);
		System.out.println("number of special char is: "+splchar);

	}
}