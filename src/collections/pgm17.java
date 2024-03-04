package collections;

import java.util.*;
import java.util.LinkedHashMap;
public class pgm17 {
      public static void main(String[] args) {
		LinkedHashMap l=new LinkedHashMap();
		l.put(1,"apple");
		l.put(2,"samsung");
		l.put(3,"samsung");
		System.out.println(l);
		System.out.println("----------");
		l.put(1,"sony");
		l.put(2,"bose");
		l.put(3,"bose");
		System.out.println(l);
	}
}
