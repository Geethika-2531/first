package collections;

import java.util.*;

public class pgm9 {
	
	public static void main(String[] args) {
		
		ArrayList <Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		for(Integer i:l)
		{
			System.out.println(i);
		}
		System.out.println("--------");
		LinkedList <String> l1=new LinkedList();
		l1.add("java");
		l1.add("sql");
		l1.add("web");
		for(String s:l1)
		{
			System.out.println(s);
		}
	}

}
