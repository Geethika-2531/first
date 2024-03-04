package strings;

public class pgm3 {

	public static void main(String[] args) {
		
		String s="Software Engineeer";
		System.out.println(s.length());
		System.out.println("---------");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("--------------");
		System.out.println(s.startsWith("Soft"));
		System.out.println(s.startsWith("SOFT"));
		System.out.println("-------------");
		System.out.println(s.endsWith("eer"));
		System.out.println(s.endsWith("EEr"));
		System.out.println("-------------");
		System.out.println(s.contains("Eng"));
		System.out.println(s.contains("eng"));
		System.out.println("------------");
		System.out.println(s.concat("in CapGemini"));
		System.out.println("----------");
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(15));
		System.out.println("------------");
		System.out.println(s.indexOf('r'));
		System.out.println(s.indexOf('r',7));
		
	}
}
