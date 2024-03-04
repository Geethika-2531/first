package first;

//import java.util.ArrayList;
//import java.util.List;
//
//public class Collections {
//
//	public static void main(String[]args) {
//		
//		List list=new ArrayList();
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//
//		list.add(3);
//		list.add(1);
//		list.add(10);
//		
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//	}
//}

//import java.util.ArrayList;
//import java.util.List;
//
//public class Collections {
//
//	public static void main(String[]args) {
//		
//		List<Integer> list=new ArrayList<Integer>();
//		list.add(3);
//		list.add(1);
//		list.add(10);
//		
//		Integer removalElement=3;
//		
//		System.out.println("Removed element" +list.remove(removalElement));
//		System.out.println("after removal");
//		
//		for(int val:list)
//			System.out.println(val);
//	}
//}

//import java.util.ArrayList;
//import java.util.List;
//
//public class Collections {
//
//	public static void main(String[]args) {
//		
//		List<Integer> list1=new ArrayList<Integer>();
//		list1.add(3);
//		list1.add(11);
//		list1.add(2);
//		
//		list1.add(0,20);
//		System.out.println(list1);
//		
//		list1.set(1,21);
//			System.out.println(list1);
//	}
//}

//import java.util.ArrayList;
//import java.util.List;
//
//public class Collections {
//
//	public static void main(String[]args) {
//		
//		List<Integer> list1=new ArrayList<Integer>();
//		list1.add(3);	list1.add(11);	list1.add(2);
//		
//			System.out.println(list1.indexOf(11));
//	}
//}
//import java.util.ArrayList;
//import java.util.List;
//
//public class Collections {
//
//	public static void main(String[]args) {
//		
//		List<Integer> list1=new ArrayList<Integer>();
//		list1.add(3);	list1.add(11);	list1.add(2);
//		
//			System.out.println(list1.indexOf(11));
//			
//			System.out.println(list1.contains(2));
//	}
//}


//import java.util.HashSet;
//import java.util.Set;
//
//class A{
//	
//	int i=4,j=5;
//}
//
//public class Collections {
//
//	public static void main(String[]args) {
//		
//		Set<A> set=new HashSet<A>();
//		
//		A a1=new A();	A a2=new A();	A a3=new A();
//		
//		set.add(a1);   set.add(a2);	set.add(a3);
//			
//		for(A a:set) {
//			
//			System.out.println(a);
//		}
//			
//	}
//}

//import java.util.HashSet;
//import java.util.Set;
//
//class A{
//	
//	int i=4;
//
//public boolean equals (Object o) {
//
//	A a=(A)o;
//	
//	boolean status=false;
//	
//	if(this.i==a.i) {
//		status=true;
//	}
//	return status;
//}
//}
//
//public class Collections {
//	public static void main(String[]args) {
//		
//		Set<A> set=new HashSet<A>();
//			
//		A a1=new A();	A a2=new A();	A a3=new A();
//		
//		set.add(a1);	set.add(a2);	set.add(a3);
//		
//		System.out.println(set.size());
//		}
//			
//	}

//import java.util.HashSet;
//import java.util.Set;
//import java.util.LinkedHashSet;
//
//public class Collections{
//	
//	public static void main(String[] args) {
//		
//		Set<String>set=new LinkedHashSet<String>();
//		
//		set.add("geethu");	set.add("sharu");	set.add("neeraja");
//		
//		for(String value:set) {
//			
//			System.out.println(value);
//		}
//		
//		
//	}
//}

//import java.util.HashSet;
//import java.util.Set;
//import java.util.TreeSet;
//
//class Iphone implements Comparable<Iphone>{
//	
//	int manufacturingDate;
//	int curbWeight;
//	int price;
//	String color;
//	
//	public int compareTo(Iphone o) {
//		
//		int value=0;
//		System.out.println("compareTo");
//		
//		if(this.price<o.price) {
//			value=1;
//		}
//			
//		else if(this.price>o.price){
//			
//			value=-1;
//			
//		}
//		return value;
//	}
//	
//	public String toString() {
//		return "Color is "+color+", price is"+price+", manufacturingDate is "+manufacturingDate;
//	}
//}
//
//public class Collections{
//	
//	public static void main(String[] args) {
//		
//		Set<Iphone>set=new TreeSet<Iphone>();
//		
//		Iphone i1=new Iphone();	Iphone i2=new Iphone();	Iphone i3=new Iphone();
//		
//		i1.price=55;	i2.price=56;	i3.price=60;
//		
//		set.add(i1);	set.add(i2);	set.add(i3);
//			
//		for(Iphone a : set)	{
//			
//			System.out.println(a);
//		}
//		
//		}
//		
//		
//	}

//import java.util.HashMap;
//import java.util.Map;
//
//public class Collections{
//	
//	public static void main(String[]args) {
//		
////		Map<Integer, String> employees=new HashMap<Integer,String>();
////		employees.put(1, "geethika");
////		employees.put(2, "geethi");
////		employees.put(3, "geethu");
////		
////		System.out.println(employees.get(1));
////		System.out.println(employees.keySet());
////		System.out.println(employees.entrySet());
//			
//			
//		}
//		
//	}


















