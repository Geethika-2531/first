package strings;

public class mobile {
	public static void main(String[] args) {
		mobile p=new mobile();
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println("-------");
		mobile p1=new mobile();
		mobile p2=new mobile();
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
	}
}