package collections;
import java.util.Set;
import java.util.TreeMap;
public class pgm16 {
       public static void main(String[] args) {
		TreeMap<Integer,Double> t=new TreeMap();
		t.put(20, 8.9);
		t.put(30, 2.3);
		t.put(12, 2.4);
		Set<Integer> s=t.keySet();
		for(Integer key:s) {
			System.out.println(key+" "+t.get(key));
		}
		TreeMap<String,Integer> t1=new TreeMap();
		t1.put("banana",90);
		t1.put("apple",63);
		t1.put("orange", 1);
		Set<String> s1=t1.keySet();
		for(String key1:s1) {
			System.out.println("cost of 1kg: "+key1+ " is "+t1.get(key1));
		}
	}
}
