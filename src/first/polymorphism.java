package first;
//public class polymorphism{
//	public void purchase(String product)
//	{
//		System.out.println(product);
//	}
//	public void purchase(String product,int cost)
//	{
//		System.out.println(product+" "+cost);
//	}
//	public void purchase(int cost,String product)
//	{
//		System.out.println(cost+" "+product);
//	}
//	public static void main(String[] args) 
//	{
//		polymorphism m=new polymorphism();
//		m.purchase("dress");
//		m.purchase("dress",20);
//		//System.out.println();
//	}
//	
//}
class polymorphism{
	String brand="iphone";
	
	int ram=8;
public String toString() {
	return brand+" "+ram;
}
public static void main(String[] args) {
	polymorphism p=new polymorphism();
	System.out.println(p);
}
}
