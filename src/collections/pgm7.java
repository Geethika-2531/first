package collections;

import java.util.*;

public class pgm7 {
	
	public static void main(String[] args) {
		
		ArrayList l1=new ArrayList(50);
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		LinkedList l2=new LinkedList(l);
		l2.add(50);
		l2.add(45);
		System.out.println(l2);
		Vector v=new Vector(l2);
		v.add(60);
		v.add(55);
		System.out.println(v);
		LinkedList l3=new LinkedList(v);
		l3.add(22);
		l3.add(25);
		System.out.println(l3);
		for(Object o:l2)
		{
			System.out.println(o);
		}
	}

}
