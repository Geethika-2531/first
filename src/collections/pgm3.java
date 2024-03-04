package collections;

import java.util.*;
public class pgm3 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a+" "+a.size());
		System.out.println("-----------");
		LinkedList l= new LinkedList();
		l.addAll(a);
		l.add(40);
		l.add(50);
		System.out.println(l+" "+l.size());
		System.out.println(l.containsAll(a));
		l.removeAll(a);
		System.out.println(l);
	}

}
