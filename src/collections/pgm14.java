package collections;

import java.util.HashMap;
public class pgm14 {
        public static void main(String[] args) {
			HashMap<Integer,String> h=new HashMap();
			h.put(18, "java");
			h.put(20,"sql");
			h.put(87,"css");
			System.out.println(h);
			System.out.println(h.get(10));
			System.out.println(h.get(18));
			System.out.println(h.containsKey(20));
			System.out.println(h.containsKey(44));
			System.out.println(h.containsValue("java"));
			System.out.println(h.containsValue("sin"));
			System.out.println(h);
			h.remove(20);
			System.out.println(h);
			System.out.println(h.isEmpty());
		    h.clear();
			System.out.println(h.isEmpty());
 
		}
}
