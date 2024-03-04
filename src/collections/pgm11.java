package collections;

import java.util.*;

public class pgm11 {

		public static void main(String[] args) {
			
//			HashMap h=new HashMap();
//			h.put(10, "java");
//			h.put("hi", 11.22);
//			System.out.println(h);
//			HashMap<Integer,String> h=new HashMap();
//			h.put(10, "geethika");
//			h.put(11, "geethik");
//			h.put(12, "geethi");
//			System.out.println(h);
//			System.out.println(h.get(11));
//			System.out.println(h.get(12));
//			System.out.println(h.containsKey(22));
//			System.out.println(h.containsValue("web"));
//			System.out.println(h);
//			h.remove(12);
//			System.out.println(h);
//			System.out.println(h.isEmpty());
//			h.clear();
//			System.out.println(h.isEmpty());
			
			
//			LinkedHashMap<String,Double> l=new LinkedHashMap();
//			l.put("mobile",555.55);
//			l.put("laptop", 666.66);
//			Set<String> s=l.keySet();
//			for(String key:s)
//			{
//				System.out.println(key+"  "+l.get(key));
//			}
			
//			TreeMap<Integer,Double> t=new TreeMap();
//			t.put(20, 8.9);
//			t.put(30, 2.3);
//			t.put(12, 2.4);
//			Set<Integer> s=t.keySet();
//			for(Integer key:s) {
//				System.out.println(key+" "+t.get(key));
//			}
//			TreeMap<String,Integer> t1=new TreeMap();
//			t1.put("banana",90);
//			t1.put("apple",63);
//			t1.put("orange", 1);
//			Set<String> s1=t1.keySet();
//			for(String key1:s1) {
//				System.out.println("cost of 1kg: "+key1+ " is "+t1.get(key1));
//			
			
			LinkedHashMap l=new LinkedHashMap();
			l.put(1, "Apple");
			l.put(2, "One+");
			System.out.println(l);
			System.out.println("------------");
			l.put(1, "sony");
			l.put(2, "bose");
			System.out.println(l);
		}
		
}