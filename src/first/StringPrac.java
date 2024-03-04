package first;

import java.util.Scanner;

//
//public class StringPrac {
//	
//	public static void main(String[]args) {
//		
//		String str=new String("abc");
//		
//		System.out.println(str.length());
//	}
//}

//public class StringPrac {
//	
//	public static void main(String[]args) {
		
//		char arr[]= {'g','e','e','t','h','i','k','a'};
		
//		for(int i=0; i<arr.length; i++) {
//			
//			if(arr[i]=='a') {
//				
//				arr[i]='r';
//			}
//		}
//		
//		for(char ch: arr) {
//			
//			System.out.println(ch);
//		}
		
//		char arr[]= {'g','e','e','t','h','i','k','a'};
//		
//		String str=new String(arr);
//		
//		System.out.println(str);
//		
//		str.replace('a', 'r');
//		
//		System.out.println(str);
//		
//	}
//}


//public class StringPrac {
//	
//	public static void main(String[]args) {
//		
////		String str="abcd";
//		
//		String str1=new String("abc");
//		String str2=new String("bcd");
//		String str3=new String("abc");
//		
////		System.out.println(str1==str2);
////		System.out.println(str1==str3);
//		
//		System.out.println(str1.equals(str3));
//		System.out.println(str1.equals(str2));
//	}
//}

//public class StringPrac {
//	
//	public static void main(String[]args) {
		
//       String str1="abc";
       
//       String str2=str1.replace('b', 'd');
//       
//       System.out.println(str1);
       
//       boolean status=str1.startsWith("bc",0);
//       System.out.println(status);
		
//		int i=4;
//		int j=5;
//		
//		System.out.println("The addition is "+i+j);
//        System.out.println(i+j+" was the addition");
//       
//	}
//}

public class StringPrac {
	
	public static void main(String[]args) {
		
		try {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter divider but not 0!!");
			
			int divider = sc.nextInt();
			
			int dividend=4;
			int result=dividend/divider;
			
			System.out.println("the result is "+result);
			
			int[] arr= {3,5,1};
			System.out.println("Enter index of an array");
			int index=sc.nextInt();
			System.out.println(arr[index]);
		}
		catch(Exception e) {
			
			System.out.println("I have told you to give 0..");
			
			main(null);
		}


	}
}









