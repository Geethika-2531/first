package collections;
import java.util.*;
public class pgm1 {
	
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(11.22);
		l.add(11.22);
		l.add("java");
		l.add("java");
		l.add("java");
		l.add(null);
		l.add('$');
		
		System.out.println(l.size());
		System.out.println(l.get(2));
		System.out.println(l.contains(20));
		System.out.println(l.contains(200));
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf(10));
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l.isEmpty());
		
	}

}
