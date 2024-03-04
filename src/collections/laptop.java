package collections;

import java.util.Objects;
import java.util.ArrayList;
public class laptop {
        String brand;
        int ram;
        laptop(String brand,int ram){
        	this.brand=brand;
        	this.ram=ram;
        }
        public static void main(String[] args) {
			laptop l1=new laptop("macbook",24);
			laptop l2=new laptop("dell",8);
			laptop l3=new laptop("lenovo",16);
			ArrayList<laptop> l=new ArrayList<laptop>();
			l.add(l1);
			l.add(l2);
			l.add(l3);
			System.out.println(l.hashCode());
			System.out.println(l1.hashCode());
			System.out.println(l2.hashCode());
			System.out.println(l3);
      for(laptop a:l)
      {
			System.out.println(a);
 
      }
		}
}