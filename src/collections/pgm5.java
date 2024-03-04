package collections;

import java.util.*;

public class pgm5 {
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add(30);
		l.add(60);
		l.add(20);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("--------------");
		Collections.sort(l);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		for(Object o:l)
		{
			System.out.println(o);
		}
	}

}
