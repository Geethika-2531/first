package strings;

import java.util.Scanner;
public class pgm9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		String st=s.nextLine();
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			char ch[]=st.toCharArray();
			if(ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]<=122||ch[i]>=48&&ch[i]<=57&&ch[i]!=' '&&ch[i]!=','&&ch[i]!='.');
			{
				count++;
			}
		}
		System.out.println("no of character are:"+count);
	}
	

}
