package collections;

import java.util.ArrayList;

public class pgm4 {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		l.add(1,50);
		System.out.println(l);
		l.set(2,60);
		System.out.println(l);
		
		for(Object o:l)//this is for each loop and o is the reference variable
		{
			System.out.println(o);
		}
		
	}
}
