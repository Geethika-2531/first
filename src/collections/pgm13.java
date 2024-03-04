package collections;

import java.util.HashMap;
public class pgm13 {
       public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(12, 's');
		h.put(12,123);
		h.put("HI", 11.22);
		h.put("geethika","geethika");
		h.put(1.22,5.43);
		h.put(null,null);
		h.put(null, 7);
		System.out.println(h);
	}
}
