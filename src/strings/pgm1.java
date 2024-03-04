package strings;

public class pgm1 {
	public static void main(String[] args) {
		pgm1 p=new pgm1();
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		System.out.println("-------");
		pgm1 p1=new pgm1();
		pgm1 p2=new pgm1();
		System.out.println(p1.equals(p2));
		System.out.println(p1==p2);
	}
}