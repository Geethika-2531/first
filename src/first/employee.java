package first;
import java.util.*;
class Employee1{
	 int emp_salary;
	 String emp_name;
	public Employee1( int emp_salary, String emp_name) {
		super();
		this.emp_salary = emp_salary;
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "employee [emp_salary=" + emp_salary + ", emp_name=" + emp_name + "]";
	}	 
}
public class employee{

	public static void main(String args[]) {
		Map<Integer,Employee1> emp = new HashMap();
		Employee1 e1 = new Employee1(20000,"geethika");
		Employee1 e2 = new Employee1(25000,"geethi");
		Employee1 e3 = new Employee1(51000,"geetu");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		int[] sal= new int[3];
		Set <Integer> keySet = emp.keySet();
		int i=0;
		for(int key:keySet) {
			int j=(emp.get(key).emp_salary);
			if(j>50000) {
				sal[i]=j;
				i++;
			}
		}
		for(int k:sal) {
			System.out.println(k);
		}
	}
}
//import java.util.*;
//
//class Employee1 {
//	int emp_id;
//	 int emp_salary;
//	 String emp_name;
//	public Employee1(int emp_id, int emp_salary, String emp_name) {
//		super();
//		this.emp_id = emp_id;
//		this.emp_salary = emp_salary;
//		this.emp_name = emp_name;
//	}
//	@Override
//	public String toString() {
//		return "Employee [emp_salary=" + emp_salary + ", emp_name=" + emp_name + "]";
//	}
//}
//public class employee{
//	
//	public static void main(String[]args) {
//		
//		Map<Integer,Employee1>Employee=new HashMap();
//		
//		Employee1 e1=new Employee1(1,40000,"geethika");
//		Employee1 e2=new Employee1(2,45000,"saranya");
//		Employee1 e3=new Employee1(3,55000,"neeraja");
//		
//		Employee.put(1,e1);
//		Employee.put(2,e2);
//		Employee.put(3,e3);
//		
//		int[] sal= new int[3];
//		Set <Integer> keySet = employee.keySet();
//		int i=0;
//		for(int key:keySet) {
//			int j=(employee.get(key).emp_salary);
//			if(j>50000) {
//				sal[i]=j;
//				i++;
//			}
//		}
//		System.out.println(Employee.entrySet());
//		
//	}
//
//	private static Object get(int key) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private static Set<Integer> keySet() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
//}
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
// 
//	 class employees1 {
//		 int salary;
//		String name;
//		public employees1( int salary, String name) {
//			super();
//			this.salary = salary;
//			this.name = name;
//		}
//	@Override
//		public String toString() {
//			return "salary=" + salary + ", name=" + name ;
//		}
//	}
// 
//class employee{
//	public static void main(String[] args) {
//		employees1 e1 = new employees1( 100000, "priya");
//		employees1 e2 = new employees1( 50000, "varsha");
//		employees1 e3 = new employees1( 10000, "sindhu");
//		employees1 e4 = new employees1( 80000, "geetha");
//		employees1 e5 = new employees1( 30000, "anees");
//		employees1 e6 = new employees1( 60000, "alka");
// 
//		Map <Integer, employees1> employees1 = new HashMap<Integer, employees1>();
// 
//		employees1.put(1, e1);
//		employees1.put(2, e2);
//		employees1.put(3, e3);
//		employees1.put(4, e4);
//		employees1.put(5, e5);
//		employees1.put(6, e6);
//		//System.out.println(employees1.entrySet());
//		int [] a = new int[3];
//		Set <Integer> keys = employees1.keySet();
//		int i =0;
//		for( int s : keys) {
//			int j=(employees1.get(s).salary);
//			if(j>50000) {
//				
//				System.out.println(employees1.get(s));
//			}
//		}
//	}
//}















