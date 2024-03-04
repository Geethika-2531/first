package collections;

import java.util.LinkedHashMap;
import java.util.*;
public class pgm15 {
         public static void main(String[] args) {
			LinkedHashMap<String,Double> l=new LinkedHashMap();
			l.put("mobile",999.99);
			l.put("laptop",98989.9889);
			l.put("ac",7676.9);
			l.put("hut",888.08);
			Set<String> s=l.keySet();
			for(String key:s) {
				System.out.println(key+"  "+l.get(key));
			}
		}
}